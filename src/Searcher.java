import java.io.IOException;
import java.util.ArrayList;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.util.Version;

public class Searcher {

	private IndexSearcher indexSearcher;
	private String query;
	private String field;
	private Analyzer analyzer;
	private int hitsPerPage;
	private String[] formats;

	public Searcher(Directory d, String query, String field, Analyzer analyzer,
			int hitsPerPage) throws CorruptIndexException, IOException {
		this.indexSearcher = new IndexSearcher(d, true);
		this.query = query;
		this.field = field;
		this.analyzer = analyzer;
		this.hitsPerPage = hitsPerPage;
	}

	public void search() throws ParseException, IOException {
		Query q = new QueryParser(Version.LUCENE_32, this.field, this.analyzer)
				.parse(this.query);

		TopScoreDocCollector collector = TopScoreDocCollector.create(
				hitsPerPage, true);
		this.indexSearcher.search(q, collector);
		ScoreDoc[] hits = collector.topDocs().scoreDocs;
		System.out.println("Found " + hits.length + " hits.");
		for (int i = 0; i < hits.length; ++i) {
			int docId = hits[i].doc;
			Document doc = indexSearcher.doc(docId);
			System.out.println((i + 1) + ". " + doc.get("path"));
		}
	}
	
	public void search(String formato) throws ParseException, IOException {
		//String[] my_ball = {formato,field};
		//Query q = new QueryParser(Version.LUCENE_32, this.field, this.analyzer)
	//			.parse(this.query);
	//	Query q1 = new QueryParser(Version.LUCENE_32,Indexer.FORMATO_FIELD,this.analyzer).parse(formato);
//		Term t1 = new Term(Indexer.FORMATO_FIELD,formato);
//		Term t2 = new Term(this.field,this.query);
/*		BasicQueryFactory b = new BasicQueryFactory();
		TermQuery q = b.newTermQuery(t1);
		ArrayList<SrndQuery> l = new ArrayList();
		AndQuery fin = new AndQuery(null, false, formato);
*/				
		BooleanQuery q = new BooleanQuery();
        q.add(
                new TermQuery(new Term(Indexer.FORMATO_FIELD,formato)), 
                BooleanClause.Occur.SHOULD
        );
        q.add(
                new TermQuery(new Term(this.field,this.query)), 
                BooleanClause.Occur.MUST
        );
		
		//Query fin = q.mergeBooleanQueries(q)
		TopScoreDocCollector collector = TopScoreDocCollector.create(
				hitsPerPage, true);
		this.indexSearcher.search(q, collector);
		ScoreDoc[] hits = collector.topDocs().scoreDocs;
		System.out.println("Found " + hits.length + " hits.");
		for (int i = 0; i < hits.length; ++i) {
			int docId = hits[i].doc;
			Document doc = indexSearcher.doc(docId);
			System.out.println((i + 1) + ". " + doc.get("path"));
		}
	}
	

}
