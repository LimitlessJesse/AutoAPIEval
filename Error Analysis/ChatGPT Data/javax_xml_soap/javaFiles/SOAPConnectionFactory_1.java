import javax.xml.soap.*;

public class SOAPConnectionFactory_1 {
    public static void main(String[] args) {
        try {
            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
            SOAPConnection connection = factory.createConnection();
        
            // Code to use the SOAPConnection
        
            connection.close();
        } catch (SOAPException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
