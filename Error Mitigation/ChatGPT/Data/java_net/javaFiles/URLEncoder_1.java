import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLEncoder_1 {
    public static void main(String[] args) {
        try {
            String originalString = "Hello World!";
            String encodedString = URLEncoder.encode(originalString, "UTF-8");
            System.out.println("Encoded String: " + encodedString);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported Encoding Exception: " + e.getMessage());
        }
    }
}
