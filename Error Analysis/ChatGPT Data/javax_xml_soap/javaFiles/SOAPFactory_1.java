import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPException;

public class SOAPFactory_1 {
    public static void main(String[] args) {
        try {
            SOAPFactory soapFactory = SOAPFactory.newInstance();
            SOAPElement element = soapFactory.createElement("myElement");
            System.out.println("Created element: " + element.getElementName());
        } catch (SOAPException e) {
            System.err.println("SOAPException: " + e.getMessage());
        }
    }
}
