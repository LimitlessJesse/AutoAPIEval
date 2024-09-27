import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;

public class SOAPConnectionFactory_1 {
    public static void main(String[] args) {
        try {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            System.out.println("SOAPConnection created successfully.");
        } catch (SOAPException e) {
            System.err.println("Error creating SOAPConnection: " + e.getMessage());
        }
    }
}
