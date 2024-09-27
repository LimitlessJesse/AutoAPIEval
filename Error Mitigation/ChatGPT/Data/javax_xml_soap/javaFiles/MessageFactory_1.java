import javax.xml.soap.*;

public class MessageFactory_1 {
    public static void main(String[] args) {
        try {
            MessageFactory factory = MessageFactory.newInstance();
            SOAPMessage message = factory.createMessage();
            System.out.println("SOAPMessage created successfully");
        } catch (SOAPException e) {
            System.err.println("Error creating SOAPMessage: " + e.getMessage());
        }
    }
}
