import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPException;
import java.io.InputStream;

public class AttachmentPart_3 {
    public static void main(String[] args) {
        AttachmentPart attachmentPart = new AttachmentPart();
        try {
            InputStream inputStream = new InputStream() {
                @Override
                public int read() {
                    return 0;
                }
            };
            attachmentPart.setRawContent(inputStream, "application/octet-stream");
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
