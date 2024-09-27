import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;

public class SOAPConnectionFactory_4 {
    public static void main(String[] args) {
        try {
            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
            SOAPConnection connection = factory.createConnection();
            
            // Use the SOAPConnection object for further operations
            
            connection.close();
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
