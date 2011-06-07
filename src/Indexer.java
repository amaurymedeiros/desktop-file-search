import java.io.File;
import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.DateTools;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.LockObtainFailedException;
import org.apache.lucene.util.Version;
import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

public class Indexer {

	private Analyzer analyzer;
	private File root;
	private String[] formats;
	private IndexWriter indexWriter;
	static final String FORMATO_FIELD = "type";
	static final String DATE_FIELD = "modified";
	static final String PATH_FIELD = "path";
	static final String CONTENT_FIELD = "contents";
	static final String SIZE_FIELD = "size";
	private static final String AUTHOR_FIELD = "author";
	
	public Indexer(File file, Directory d, Analyzer analyzer)
			throws CorruptIndexException, LockObtainFailedException,
			IOException {
		this.analyzer = analyzer;
		this.root = file;
		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_32,
				this.analyzer);
		config.setOpenMode(IndexWriterConfig.OpenMode.CREATE);
		this.indexWriter = new IndexWriter(d, config);
	}

	public Indexer(File file, Directory d, Analyzer analyzer, String[] formats)
			throws CorruptIndexException, LockObtainFailedException,
			IOException {
		this.formats = formats;
		this.analyzer = analyzer;
		this.root = file;
		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_32,
				this.analyzer);
		config.setOpenMode(IndexWriterConfig.OpenMode.CREATE);
		this.indexWriter = new IndexWriter(d, config);
	}

	private void indexFiles(File file) throws IOException {
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
				Parser p = new Parser(file);
				try {
					p.load();
					Document doc = new Document();
					doc.add(new Field(DATE_FIELD,DateTools.timeToString(file.lastModified(), DateTools.Resolution.MINUTE),Field.Store.YES,  
					        Field.Index.NOT_ANALYZED));
					String content = p.getContent();
					if(content != null)
					doc.add(new Field(CONTENT_FIELD, content,Field.Store.YES, Field.Index.ANALYZED));
					String author = p.getAuthor();
					if(author != null)
					doc.add(new Field(AUTHOR_FIELD,author,Field.Store.YES, Field.Index.ANALYZED));
					doc.add(new Field(PATH_FIELD, file.getAbsolutePath(),
							Field.Store.YES, Field.Index.ANALYZED));
					doc.add(new Field(SIZE_FIELD,String.valueOf(file.length()),Field.Store.YES, Field.Index.ANALYZED));
					for (String format : formats) {
						if (file.getName().endsWith(format)) {
							// System.out.println("Entrou AQUI!");
							doc.add(new Field(FORMATO_FIELD, format,
									Field.Store.YES, Field.Index.ANALYZED));
							break;
						}
					}
					p.close();
					this.indexWriter.addDocument(doc);
				}
				// at least on windows, some temporary files raise this
				// exception with an "access denied" message
				// checking if the file can be read doesn't help
				catch (IOException e) {
					System.out.println("Ignorando o arquivo " + file);
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					System.out.println("Impossivel acessar  " + file);
				} catch (TikaException e) {
					// TODO Auto-generated catch block
					System.out.println("Impossivel traduzir  " + file);
				}
			}
		}
	}

	public void indexAll() {
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

	public void close() throws CorruptIndexException, IOException {
		this.indexWriter.close();
	}

}
