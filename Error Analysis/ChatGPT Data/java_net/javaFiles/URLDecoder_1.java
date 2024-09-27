import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URLDecoder_1 {
    public static void main(String[] args) {
        String encodedString = "Hello%20World%21";
        
        try {
            String decodedString = URLDecoder.decode(encodedString, "UTF-8");
            System.out.println(decodedString);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported Encoding Exception: " + e.getMessage());
        }
    }
}
