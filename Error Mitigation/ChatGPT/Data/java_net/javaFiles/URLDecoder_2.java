import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URLDecoder_2 {
    public static void main(String[] args) {
        try {
            String encodedString = "Hello%20World";
            String decodedString = URLDecoder.decode(encodedString, "UTF-8");
            System.out.println(decodedString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
