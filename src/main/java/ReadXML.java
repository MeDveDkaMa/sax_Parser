import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class ReadXML {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

       // final StringBuffer str = new StringBuffer();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        DefaultHandler handler = new DefaultHandler(){
            
            @Override
            public void startDocument() throws SAXException {
                System.out.println("Start parse XML\n" + "========");
            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                String str = "";
                
                for (int i = 0; i < length; i++) {
                    str +=ch[start+i];
                }
                System.out.print(str);
            }

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    System.out.println(qName + ":");

            }
        };


        saxParser.parse(new File("/home/alexander/IdeaProjects/Dom_Parser/src/main/resources/university.xml"),handler);
    }
}
