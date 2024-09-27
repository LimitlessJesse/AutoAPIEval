import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class URLDecoder_1 {
    public static void main(String[] args) {
        try {
            String encodedString = "Hello%20World%21";
            String decodedString = URLDecoder.decode(encodedString, "UTF-8");
            System.out.println(decodedString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
