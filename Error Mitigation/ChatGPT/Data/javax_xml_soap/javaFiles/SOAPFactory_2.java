import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPElement;

public class SOAPFactory_2 {
    public static void main(String[] args) {
        try {
            SOAPFactory soapFactory = SOAPFactory.newInstance();
            SOAPElement element = soapFactory.createElement("exampleElement");
            System.out.println("Created SOAPElement: " + element);
        } catch (SOAPException e) {
            System.err.println("Error creating SOAPElement: " + e.getMessage());
        }
    }
}
