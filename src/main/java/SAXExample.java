import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class SAXExample {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        XmlHandler handler = new XmlHandler();
        saxParser.parse(new File("./src/main/resources/university.xml"),handler);

        List<User> users = XmlHandler.getUser();
        for(User emp : users) {
            System.out.println(emp);
        }
    }
}
