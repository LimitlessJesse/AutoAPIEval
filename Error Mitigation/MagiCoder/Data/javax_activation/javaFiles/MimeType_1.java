import javax.activation.MimeType;

public class MimeType_1 {
    public static void main(String[] args) {
        MimeType mimeType = new MimeType("text/plain");
        System.out.println(mimeType.getBaseType());
    }
}
