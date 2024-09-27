import javax.activation.MimeType;

public class MimeType_5 {
    public static void main(String[] args) {
        MimeType mimeType = new MimeType("text/plain");
        boolean isMatch = mimeType.match(new MimeType("text/plain"));
        System.out.println("Is match: " + isMatch);
    }
}
