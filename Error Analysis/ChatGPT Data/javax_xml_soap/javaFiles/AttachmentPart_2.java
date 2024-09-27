import javax.xml.soap.AttachmentPart;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;

public class AttachmentPart_2 {
    public static void main(String[] args) {
        try {
            // Create a SOAPMessage
            MessageFactory factory = MessageFactory.newInstance();
            SOAPMessage message = factory.createMessage();

            // Create an AttachmentPart
            AttachmentPart attachment = message.createAttachmentPart();

            // Add content to the AttachmentPart

            // Clear the content of the AttachmentPart
            attachment.clearContent();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
