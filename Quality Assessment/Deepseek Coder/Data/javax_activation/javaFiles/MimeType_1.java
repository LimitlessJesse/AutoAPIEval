import javax.activation.MimeType;
import javax.activation.MimeTypeParseException;

public class MimeType_1 {
    public static void main(String[] args) {
        try {
            MimeType mimeType = new MimeType("text/plain");
            String subType = mimeType.getSubType();
            System.out.println(subType);
        } catch (MimeTypeParseException e) {
            e.printStackTrace();
        }
    }
}
