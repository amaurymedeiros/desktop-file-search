import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;


public class Parser {
	FileInputStream is;
	ContentHandler contenthandler;
	Metadata metadata;
	File file;
	AutoDetectParser my_parser;
	String content;
	String author;
	String format;
	public Parser(File f) throws FileNotFoundException {
		is = new FileInputStream(f);
		 contenthandler = new BodyContentHandler();
	      metadata = new Metadata();
	      metadata.set(Metadata.RESOURCE_NAME_KEY, f.getName());
	       my_parser = new AutoDetectParser();
	      // OOXMLParser parser = new OOXMLParser();
	}
	public void load() throws IOException, SAXException, TikaException{
		my_parser.parse(is, contenthandler, metadata);
		format = metadata.get(Metadata.CONTENT_TYPE);
	     author = metadata.get(Metadata.AUTHOR);
	    content =  contenthandler.toString();
	}
	public String getContent() {
		return content;
	}
	public String getAuthor() {
		return author;
	}
	public String getFormat() {
		return format;
	}
	
}
