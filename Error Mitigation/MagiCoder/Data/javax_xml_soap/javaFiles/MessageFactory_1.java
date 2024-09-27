import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

public class MessageFactory_1 {
    public static void main(String[] args) {
        try {
            // Create a MessageFactory
            MessageFactory factory = MessageFactory.newInstance();

            // Create a new SOAPMessage
            SOAPMessage message = factory.createMessage();

            // Print the SOAPMessage
            System.out.println(message.toString());
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
