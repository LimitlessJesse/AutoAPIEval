import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPMessage;

public class SOAPConnection_3 {
    public static void main(String[] args) {
        try {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage soapMessage = messageFactory.createMessage();
            
            // Use the SOAPMessage to invoke web service
            SOAPMessage response = soapConnection.get(soapMessage);
            
            System.out.println("SOAP Response:");
            response.writeTo(System.out);
            
            soapConnection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
