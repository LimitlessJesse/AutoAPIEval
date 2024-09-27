import javax.xml.soap.SOAPFactory;
import javax.xml.soap.Name;

public class SOAPFactory_4 {
    public static void main(String[] args) {
        SOAPFactory soapFactory;
        try {
            soapFactory = SOAPFactory.newInstance();
            String localName = "exampleLocalName";
            String prefix = "examplePrefix";
            String uri = "http://www.example.com";
            
            Name name = soapFactory.createName(localName, prefix, uri);
            
            System.out.println("Created Name: " + name.getQualifiedName());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
