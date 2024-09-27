import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLEncoder_1 {
    public static void main(String[] args) {
        try {
            String originalString = "This is a test string!";
            String encodedString = URLEncoder.encode(originalString, "UTF-8");

            System.out.println("Original String: " + originalString);
            System.out.println("Encoded String: " + encodedString);
        } catch (UnsupportedEncodingException e) {
            System.err.println("Unsupported Encoding: " + e.getMessage());
        }
    }
}
