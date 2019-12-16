import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;

public class XmlHandler extends DefaultHandler {

    private static ArrayList<User> user = new ArrayList<>();
    private StringBuffer data;
    User User;

    public static ArrayList<User> getUser() {
        return user;
    }

    boolean bid = false;
    boolean bFname = false;
    boolean bLname = false;
    boolean bContact = false;
    boolean bEmail = false;
    boolean bDepartment = false;
    boolean bFaculty = false;
    boolean bCity = false;
    boolean bPosition = false;



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

        if (qName.equalsIgnoreCase("administration") || qName.equalsIgnoreCase("student"))
        {
            User = new User();
        }
        if (qName.equalsIgnoreCase("id"))
        {
            bid = true;
        }
        if (qName.equalsIgnoreCase("FirstName"))
        {
            bFname = true;
        }
        if (qName.equalsIgnoreCase("LastName"))
        {
            bLname = true;
        }
        if (qName.equalsIgnoreCase("ContactNo"))
        {
            bContact = true;
        }
        if (qName.equalsIgnoreCase("Email"))
        {
            bEmail = true;
        }
        if (qName.equalsIgnoreCase("Department"))
        {
            bDepartment = true;
        }
        if (qName.equalsIgnoreCase("Faculty"))
        {
            bFaculty = true;
        }
        if (qName.equalsIgnoreCase("City"))
        {
            bCity = true;
        }
        if (qName.equalsIgnoreCase("position"))
        {
            bPosition = true;
        }
        data = new StringBuffer();
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (bid){
            User.setId(Integer.parseInt(String.valueOf(data)));
            bid = false;
        }
        if (bFname){
            User.setFirstName(data.toString());
            bFname = false;
        }
        if (bContact){
            User.setContactNo(data.toString());
            bContact = false;
        }
        if (bEmail){
            User.setEmail(data.toString());
            bEmail = false;
        }
        if (bDepartment){
            User.setDepartment(data.toString());
            bDepartment = false;
        }
        if (bFaculty){
            User.setFaculty(data.toString());
            bFaculty = false;
        }
        if (bCity){
            User.setCity(data.toString());
            bCity = false;
        }
        if (bPosition){
            User.setPosition(data.toString());
            bPosition = false;
        }
        if (bLname){
            User.setLastName(data.toString());
            bLname = false;
        }

        if (qName.equalsIgnoreCase("administration") || qName.equalsIgnoreCase("student"))
        {
            user.add(User);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       data.append(new String(ch,start,length));
    }


}
