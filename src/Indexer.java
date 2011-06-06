import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.LockObtainFailedException;
import org.apache.lucene.util.Version;

public class Indexer {

	private Analyzer analyzer;
	private File root;
	private IndexWriter indexWriter;

	public Indexer(File file, Directory d, Analyzer analyzer) throws CorruptIndexException, LockObtainFailedException, IOException {
		this.analyzer = analyzer;
		this.root = file;
		this.indexWriter = new IndexWriter(d, new IndexWriterConfig(
				Version.LUCENE_32, this.analyzer));

	}

	private void indexFiles(File file)
			throws IOException {
		if (file.canRead()) {
			if (file.isDirectory()) {
				String[] files = file.list();
				// an IO error could occur
				if (files != null) {
					for (int i = 0; i < files.length; i++) {
						indexFiles(new File(file, files[i]));
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
					this.indexWriter.addDocument(doc);
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
	
	public void indexAll () {
		try {
			this.indexFiles(this.root);
			this.indexWriter.optimize();
			this.indexWriter.close();
			
		} catch (CorruptIndexException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
