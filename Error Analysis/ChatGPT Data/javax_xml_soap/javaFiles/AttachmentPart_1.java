import javax.xml.soap.AttachmentPart;

public class AttachmentPart_1 {
    public static void main(String[] args) {
        AttachmentPart attachment = new AttachmentPart();
        String contentId = attachment.getContentId();
        System.out.println("Content ID: " + contentId);
    }
}
