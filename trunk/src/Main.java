import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;

public class Main {

	public static void main(String[] args) {
		String path = "colecao";
		Analyzer analyzer = new BrazilianAnalyzer(Version.LUCENE_32,
				BrazilianAnalyzer.getDefaultStopSet());
		File root = new File(path);
		try {
			Directory d = new SimpleFSDirectory(root);
			Indexer indexer = new Indexer(root, d, analyzer);
			indexer.indexAll();

			String query = "roofing";
			int hitsPerPage = 10;

			
			Searcher searcher = new Searcher(d, query, "contents", analyzer, hitsPerPage);
			searcher.search();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
