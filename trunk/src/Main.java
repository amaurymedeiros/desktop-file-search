import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.apache.lucene.index.IndexNotFoundException;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.NoSuchDirectoryException;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;

public class Main {
    // No combobox da interface nao colocar so a extensao. Colocar mais info.
	// Ex: Arquivos de texto (.txt), Arquivos python (.py), etc.
	private static String[] formats = {"txt", "pdf", "doc", "py"};

	public static void main(String[] args) throws java.text.ParseException {
		String path = "colecao";
		Analyzer analyzer = new BrazilianAnalyzer(Version.LUCENE_32,
				BrazilianAnalyzer.getDefaultStopSet());
		File root = new File(path);
		try {
			Directory indexDir = new SimpleFSDirectory(new File("indices"));
			
			//Pergunta se deseja reindexar.
			System.out
					.println("Voce gostaria de realizar uma indexação na sua coleção? (S para sim, qualquer outra coisa para não)");
			Scanner sc = new Scanner(System.in);
			String resp = sc.nextLine();
			
			if (resp.trim().toLowerCase().equals("s")) {
				Indexer indexer = new Indexer(root, indexDir, analyzer,formats );
				indexer.indexAll();
			} 
				

			String query = "";
			System.out.println("Digite a consulta que quer realizar:");
			query = sc.nextLine().trim();
			
			int hitsPerPage = 10;
            try {
            	Searcher searcher = new Searcher(indexDir, query, "contents",
    					analyzer, hitsPerPage);
            	//searcher.search()
            	System.out.println("Digite o tipo de arquivo que quer pesquisar. (Tipos invalidos serao desconsiderados).");
            	String tipo = sc.nextLine().trim();
            	String dateFormat = "dd/MM/yyyy - hh:mm";
            	SimpleDateFormat formatador = new SimpleDateFormat(dateFormat);

            	
            	System.out.println("Formato das datas: " + dateFormat);
            	System.out.println("Informe a data de inicio. Datas invalidas serao desconsideradas.");
            	
            	Date min;
				try {
					min = formatador.parse(sc.nextLine().trim());
				} catch (java.text.ParseException e) {
					min = null;
				}
				System.out.println("Informe a data final. Datas invalidas serao desconsideradas.");
            	Date max;
				try {
					max = formatador.parse(sc.nextLine().trim());
				} catch (java.text.ParseException e) {
					max = null;
				}
            	
            	
    			searcher.search(null,query,tipo, min, max,0,Long.MAX_VALUE);
			} catch (IndexNotFoundException e) {
				System.out.println("Sua coleção ainda não foi indexada.");
			} catch (NoSuchDirectoryException e) {
				System.out.println("Sua coleção ainda não foi indexada.");
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
