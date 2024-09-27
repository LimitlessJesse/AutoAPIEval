import javax.activation.MimeType;

public class MimeType_8 {
    public static void main(String[] args) {
        MimeType mimeType1 = new MimeType("text/plain");
        MimeType mimeType2 = new MimeType("text/html");

        System.out.println(mimeType1.match(mimeType2)); // Output: false
    }
}
