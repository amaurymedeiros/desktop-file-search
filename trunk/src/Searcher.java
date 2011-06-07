import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.DateTools;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;

public class Searcher {

	private IndexSearcher indexSearcher;

	private int hitsPerPage;

	public Searcher(Directory d, String query, String field, Analyzer analyzer,
			int hitsPerPage) throws CorruptIndexException, IOException {
		this.indexSearcher = new IndexSearcher(d, true);
		this.hitsPerPage = hitsPerPage;
	}

	public void search(String path,String query, String formato, Date min, Date max,
			long sizeMin, long sizeMax) throws java.text.ParseException, CorruptIndexException, IOException {
		BooleanQuery q = new BooleanQuery();
		if(path != null){
			q.add(new TermQuery(new Term(Indexer.PATH_FIELD, path)),
					BooleanClause.Occur.MUST);
		}
		if (query != null) {
			q.add(new TermQuery(new Term(Indexer.CONTENT_FIELD, query)),
					BooleanClause.Occur.MUST);
		}
		if (formato != null) {
			q.add(new TermQuery(new Term(Indexer.FORMATO_FIELD, formato)),
					BooleanClause.Occur.MUST);
		}
		Date m1 = min;
		Date m2 = max;
		if (min == null) {
			m1 = new Date(0);
		}
		if (max == null) {
			m2 = new Date(Calendar.getInstance().getTimeInMillis());
		}
		
		TopScoreDocCollector collector = TopScoreDocCollector.create(
				hitsPerPage, true);
		this.indexSearcher.search(q, collector);
		ScoreDoc[] hits = collector.topDocs().scoreDocs;
		
		int quant_results = 0;
		
		for (int i = 0; i < hits.length; ++i) {
			boolean date_ok = false;
			boolean size_ok = false;
			int docId = hits[i].doc;
			Document doc = indexSearcher.doc(docId);
			String doc_size = doc.get(Indexer.SIZE_FIELD);
			long size = Long.valueOf(doc_size);
			String doc_data = doc.get(Indexer.DATE_FIELD);
			Date d = DateTools.stringToDate(doc_data);
			if (d.before(m2) && d.after(m1)) {
				date_ok = true;
			}if(sizeMin < size && size < sizeMax){
				size_ok = true;
			}
			if(date_ok && size_ok){
				System.out.println((++quant_results) + ". " + doc.get("path"));
				System.out.println("Sumário:");
				System.out.println(this.indexSearcher.explain(q, docId).toString());
			}
		}
		System.out.println("Total: " + quant_results + " resultados.");
		
	}

}
