import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.apache.lucene.index.IndexNotFoundException;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.NoSuchDirectoryException;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;

public class Main {

	private static String[] formats = {"txt", "pdf", "doc"};

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
				

			String query = "Steve";
			int hitsPerPage = 10;
            try {
            	Searcher searcher = new Searcher(indexDir, query, "contents",
    					analyzer, hitsPerPage);
            	//searcher.search()
            	String tipo = "doc";
            	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy - hh:mm");
            	
//            	Date min = formatador.parse("06/06/2011 - 03:40");
//            	Date max = formatador.parse("06/06/2011 - 03:46");
            	Date min = null, max = null;
    			searcher.search(tipo, min, max);
			} catch (IndexNotFoundException e) {
				System.out.println("Sua coleção ainda não foi indexada.");
			} catch (NoSuchDirectoryException e) {
				System.out.println("Sua coleção ainda não foi indexada.");
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
