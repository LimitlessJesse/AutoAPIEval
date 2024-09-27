import javax.xml.soap.*;

public class SOAPFactory_1 {
    public static void main(String[] args) {
        try {
            SOAPFactory soapFactory = SOAPFactory.newInstance();
            Name name = soapFactory.createName("Envelope", "env", "http://www.w3.org/2003/05/soap-envelope");
            SOAPElement soapElement = soapFactory.createElement(name);
            System.out.println("Created SOAPElement: " + soapElement);
        } catch (SOAPException e) {
            System.err.println("Error creating SOAPElement: " + e.getMessage());
        }
    }
}
