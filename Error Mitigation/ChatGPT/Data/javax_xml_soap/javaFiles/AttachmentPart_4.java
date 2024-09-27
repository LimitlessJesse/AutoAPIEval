import javax.xml.soap.AttachmentPart;

public class AttachmentPart_4 {
    public static void main(String[] args) {
        AttachmentPart attachment = new AttachmentPart();
        String contentType = attachment.getContentType();
        System.out.println("Content-Type: " + contentType);
    }
}
