import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.DateTools;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.util.Version;

public class Searcher {

	private IndexSearcher indexSearcher;

	private int hitsPerPage;

	private Analyzer analyzer;

	public Searcher(Directory d, Analyzer analyzer, int hitsPerPage)
			throws CorruptIndexException, IOException {
		this.indexSearcher = new IndexSearcher(d, true);
		this.hitsPerPage = hitsPerPage;
		this.analyzer = analyzer;
	}

	public void search(String query, String[] formato, Date min, Date max,
			long sizeMin, long sizeMax) throws java.text.ParseException,
			CorruptIndexException, IOException, ParseException {
		BooleanQuery q = new BooleanQuery();

		if (query != null) {
			MultiFieldQueryParser queryParser = new MultiFieldQueryParser(
					Version.LUCENE_32, Indexer.FIELDS, analyzer);
			queryParser.setAllowLeadingWildcard(true);
			q.add(queryParser.parse(query), BooleanClause.Occur.MUST);
		}
		if (formato != null && formato.length > 0) {
			BooleanQuery aux = new BooleanQuery();
			for (String n : formato) {
				QueryParser parser = new QueryParser(Version.LUCENE_32,
						Indexer.FORMATO_FIELD, analyzer);
				parser.setAllowLeadingWildcard(true);
				Query q14 = parser.parse(n);
				aux.add(q14, BooleanClause.Occur.SHOULD);
			}
			q.add(aux, BooleanClause.Occur.MUST);
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
		System.out.println("Total: " + hits.length + " resultados.");
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
			}
			if (sizeMin < size && size < sizeMax) {
				size_ok = true;
			}
			if (date_ok && size_ok) {
				System.out.println((++quant_results) + ". " + doc.get("path"));
				System.out.println("Sumário:");
				System.out.println(this.indexSearcher.explain(q, docId)
						.toString());
			}
		}

	}
}
