import javax.xml.soap.AttachmentPart;

public class AttachmentPart_3 {
    public static void main(String[] args) {
        AttachmentPart attachment = new AttachmentPart();
        attachment.setContentId("12345");
        System.out.println("Content ID: " + attachment.getContentId());
    }
}
