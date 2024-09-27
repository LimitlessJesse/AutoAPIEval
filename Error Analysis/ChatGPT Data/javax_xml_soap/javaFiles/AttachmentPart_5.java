import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.stream.StreamResult;

public class AttachmentPart_5 {
    public static void main(String[] args) {
        try {
            // Create a SOAPMessage
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage message = messageFactory.createMessage();

            // Create an AttachmentPart
            AttachmentPart attachmentPart = message.createAttachmentPart();

            // Add MIME header to the AttachmentPart
            attachmentPart.addMimeHeader("Content-Type", "text/plain");

            // Display the AttachmentPart content
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.transform(attachmentPart.getContent(), new StreamResult(System.out));

        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
