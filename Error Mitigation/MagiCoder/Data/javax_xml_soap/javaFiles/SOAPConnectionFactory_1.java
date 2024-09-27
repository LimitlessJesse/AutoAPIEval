import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;

public class SOAPConnectionFactory_1 {
    public static void main(String[] args) {
        try {
            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
            SOAPConnection connection = factory.createConnection();
            // Use the connection as needed...
            connection.close();
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
