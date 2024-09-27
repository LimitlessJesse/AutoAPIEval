import javax.xml.soap.*;

public class SOAPPart_5 {
    public static void main(String[] args) {
        try {
            MessageFactory factory = MessageFactory.newInstance();
            SOAPMessage message = factory.createMessage();
            SOAPPart soapPart = message.getSOAPPart();
            
            soapPart.removeAllMimeHeaders();
            System.out.println("All MIME headers removed successfully.");
        } catch (SOAPException e) {
            System.out.println("Error removing MIME headers: " + e.getMessage());
        }
    }
}
