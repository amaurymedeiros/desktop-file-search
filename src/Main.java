import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
	// No combobox da interface nao colocar so a extensao. Colocar mais info.
	// Ex: Arquivos de texto (.txt), Arquivos python (.py), etc.
	private static String[] formats = { "txt", "pdf", "doc", "docx", "py", "c", "cpp",
			"java" };

	public static void main(String[] args) throws java.text.ParseException,
			ParseException {
		String path = "colecao";
		Analyzer analyzer = new BrazilianAnalyzer(Version.LUCENE_32,
				BrazilianAnalyzer.getDefaultStopSet());
		File root = new File(path);
		try {
			Directory indexDir = new SimpleFSDirectory(new File("indices"));			

			// Pergunta se deseja reindexar.
			System.out
					.println("Voce gostaria de realizar uma indexa��o na sua cole��o? (S para sim, qualquer outra coisa para n�o)");
			Scanner sc = new Scanner(System.in);
			String resp = sc.nextLine();

			if (resp.trim().toLowerCase().equals("s")) {
				Indexer indexer = new Indexer(root, indexDir, analyzer, formats);
				indexer.indexAll();
			}

			String query = "";
			System.out.println("Digite a consulta que quer realizar:");
			query = sc.nextLine().trim();
			query = query.equals("") ? null : query;
			String formats[] = null;
			int hitsPerPage = 10;
			try {

				System.out
						.println("Digite o tipo de arquivo que quer pesquisar. (Tipos invalidos serao desconsiderados).");
				String tipo = sc.nextLine().trim();
				formats = tipo.equals("") ? null : tipo.split(";");

				String dateFormat = "dd/MM/yyyy - hh:mm";
				SimpleDateFormat formatador = new SimpleDateFormat(dateFormat);

				System.out.println("Formato das datas: " + dateFormat);
				System.out
						.println("Informe a data de inicio. Datas invalidas serao desconsideradas.");

				Date min;
				try {
					min = formatador.parse(sc.nextLine().trim());
				} catch (java.text.ParseException e) {
					min = null;
				}
				System.out
						.println("Informe a data final. Datas invalidas serao desconsideradas.");
				Date max;
				try {
					max = formatador.parse(sc.nextLine().trim());
				} catch (java.text.ParseException e) {
					max = null;
				}

				System.out.println("Quantos resultados gostaria de exibir?");
				try {
					hitsPerPage = Integer.parseInt(sc.nextLine().trim());
				} catch (Exception e) {
					//
				}
				Searcher searcher = new Searcher(indexDir, analyzer, hitsPerPage);

				List<ResultadoDeBusca> result = searcher.search(query, formats, min, max, 0,
						Long.MAX_VALUE);
				System.out.println(result);
				// searcher.search();
			} catch (IndexNotFoundException e) {
				System.out.println("Sua cole��o ainda n�o foi indexada.");
			} catch (NoSuchDirectoryException e) {
				System.out.println("Sua cole��o ainda n�o foi indexada.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
