import javax.activation.MimeType;

public class MimeType_2 {
    public static void main(String[] args) {
        MimeType mimeType = new MimeType("text/plain");
        String subType = mimeType.getSubType();
        System.out.println("Subtype: " + subType);
    }
}
