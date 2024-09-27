import javax.xml.soap.AttachmentPart;
import java.io.InputStream;

public class AttachmentPart_4 {
    public static void main(String[] args) {
        // Assume attachmentPart is already initialized
        AttachmentPart attachmentPart = new AttachmentPart();
        
        try {
            InputStream inputStream = attachmentPart.getRawContent();
            // Use inputStream to read the raw content
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
