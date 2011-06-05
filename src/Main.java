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

	private static IndexWriter indexWriter;
	private static IndexReader indexReader;
	private static IndexSearcher indexSearcher;
	private static String path = "C:\\Users\\daniloaf\\Desktop\\SRI-teste";
	private static Analyzer analyzer;
	private static File root;

	private static void addDoc(IndexWriter w, String value) throws IOException {
		Document doc = new Document();
		doc.add(new Field("title", value, Field.Store.YES, Field.Index.ANALYZED));
		w.addDocument(doc);
	}

	private static void indexFilesFromRoot(IndexWriter writer, File file)
			throws IOException {
		if (file.canRead()) {
			if (file.isDirectory()) {
				String[] files = file.list();
				// an IO error could occur
				if (files != null) {
					for (int i = 0; i < files.length; i++) {
						indexFilesFromRoot(writer, new File(file, files[i]));
					}
				}
			} else {
				System.out.println("adding " + file);
				FileReader fr = null;
				try {
					fr = new FileReader(file);
					Document doc = new Document();
					doc.add(new Field("contents", fr));
					doc.add(new Field("path", file.getAbsolutePath(),
							Field.Store.YES, Field.Index.ANALYZED));
					writer.addDocument(doc);
				}
				// at least on windows, some temporary files raise this
				// exception with an "access denied" message
				// checking if the file can be read doesn't help
				catch (IOException e) {
					System.out.println("Ignorando o arquivo " + file);
				} finally {
					fr.close();
				}
			}
		}

	}

	public static void main(String[] args) {
		analyzer = new BrazilianAnalyzer(Version.LUCENE_32,
				BrazilianAnalyzer.getDefaultStopSet());
		root = new File(path);
		try {
			Directory d = new SimpleFSDirectory(root);
			indexWriter = new IndexWriter(d, new IndexWriterConfig(
					Version.LUCENE_32, analyzer));
			indexFilesFromRoot(indexWriter, root);
			indexWriter.optimize();
			indexWriter.close();
			indexSearcher = new IndexSearcher(d, true);
			String query = "ARA";
			int hitsPerPage = 10;
			Query q = new QueryParser(Version.LUCENE_32, "contents", analyzer)
					.parse(query);
			TopScoreDocCollector collector = TopScoreDocCollector.create(
					hitsPerPage, true);
			indexSearcher.search(q, collector);
			ScoreDoc[] hits = collector.topDocs().scoreDocs;
			System.out.println("Found " + hits.length + " hits.");
			for (int i = 0; i < hits.length; ++i) {
				int docId = hits[i].doc;
				Document doc = indexSearcher.doc(docId);
				System.out.println((i + 1) + ". " + doc.get("path"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
