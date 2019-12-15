import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;

public class XmlHandler extends DefaultHandler {

    private static ArrayList<Administrator> administrator = new ArrayList<>();
    private StringBuffer data;

    public static ArrayList<Administrator> getAdministrator() {
        return administrator;
    }

    boolean bfname = false;
    boolean blname = false;



    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parsing:\n" + "============");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End parsing:\n" + "============");

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equalsIgnoreCase("FirstName"))
        {
            bfname = true;
        }

        if (qName.equalsIgnoreCase("LastName"))
        {
            blname = true;
        }

        data = new StringBuffer();
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        //data.append(new String(ch,start,length));

        if (bfname){
           administrator.add(new Administrator(new String(ch,start,length)));
            bfname = false;
        }
        if (blname){
            bfname = false;
        }
    }


}
