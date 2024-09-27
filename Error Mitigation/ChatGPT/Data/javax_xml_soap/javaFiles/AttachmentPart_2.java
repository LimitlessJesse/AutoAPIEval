import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPException;

public class AttachmentPart_2 {
    public static void main(String[] args) {
        AttachmentPart attachmentPart = new AttachmentPart();
        
        try {
            InputStream inputStream = attachmentPart.getBase64Content();
            // Use the InputStream to read the Base64 encoded content of the AttachmentPart
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
