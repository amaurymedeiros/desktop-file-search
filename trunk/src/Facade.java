import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.LockObtainFailedException;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;


public class Facade {

	private Directory indexDir;
	private Analyzer analyzer;
	
	public void Facade() throws IOException {
		indexDir = new SimpleFSDirectory(new File("indices"));
		analyzer = new BrazilianAnalyzer(Version.LUCENE_32,
				BrazilianAnalyzer.getDefaultStopSet());
	}
	
	
	public void index(String path, String[] formats) throws CorruptIndexException, LockObtainFailedException, IOException{
		File root = new File(path);
		Indexer indexer = new Indexer(root, indexDir, analyzer, formats);
		indexer.indexAll();
	}
	
	
	public String search( String[] formats, int hitsPerPage, Date dataInicial, Date dataFinal, String query) throws CorruptIndexException, IOException, ParseException, org.apache.lucene.queryParser.ParseException{
		Searcher searcher = new Searcher(indexDir, analyzer, hitsPerPage);
		String result = searcher.search(query, formats, dataInicial, dataFinal, 0, Long.MAX_VALUE);
		return result;
	}
	
}
