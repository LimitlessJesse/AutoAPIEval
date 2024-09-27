import javax.xml.soap.*;

public class SOAPMessage_5 {
    public static void main(String[] args) {
        try {
            // Create a SOAP message
            MessageFactory factory = MessageFactory.newInstance();
            SOAPMessage message = factory.createMessage();

            // Get the SOAP header from the SOAP message
            SOAPHeader header = message.getSOAPHeader();

            // Print out the SOAP header
            System.out.println("SOAP Header: " + header);

        } catch (SOAPException e) {
            System.err.println("Error occurred while getting SOAP header: " + e.getMessage());
        }
    }
}
