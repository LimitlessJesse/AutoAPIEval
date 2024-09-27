import javax.xml.soap.*;

public class SOAPMessage_1 {
    public static void main(String[] args) {
        try {
            // Create a new SOAPMessage
            MessageFactory factory = MessageFactory.newInstance();
            SOAPMessage message = factory.createMessage();

            // Get the SOAPPart from the SOAPMessage
            SOAPPart soapPart = message.getSOAPPart();

            // Print out the SOAPPart object
            System.out.println("SOAPPart object: " + soapPart);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
