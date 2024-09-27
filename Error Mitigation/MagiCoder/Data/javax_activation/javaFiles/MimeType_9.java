import javax.activation.MimeType;
import javax.activation.MimeTypeParseException;

public class MimeType_9 {
    public static void main(String[] args) throws MimeTypeParseException {
        MimeType mimeType = new MimeType("text/plain");
        boolean isMatch = mimeType.match("text/plain");
        System.out.println(isMatch);
    }
}
