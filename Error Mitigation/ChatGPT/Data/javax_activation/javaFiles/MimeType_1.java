import javax.activation.MimeType;

public class MimeType_1 {
    public static void main(String[] args) {
        MimeType mimeType = new MimeType("text/plain");
        String primaryType = mimeType.getPrimaryType();
        System.out.println("Primary type: " + primaryType);
    }
}
