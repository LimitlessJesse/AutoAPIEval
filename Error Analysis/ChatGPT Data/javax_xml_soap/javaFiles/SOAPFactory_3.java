import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPException;

public class SOAPFactory_3 {
    public static void main(String[] args) {
        try {
            SOAPFactory soapFactory = SOAPFactory.newInstance();
            String localName = "sample";
            javax.xml.soap.Name name = soapFactory.createName(localName);
            System.out.println("Name created: " + name);
        } catch (SOAPException e) {
            System.out.println("Error creating Name: " + e.getMessage());
        }
    }
}
