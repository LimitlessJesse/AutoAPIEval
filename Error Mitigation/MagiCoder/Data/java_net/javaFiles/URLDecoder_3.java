import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class URLDecoder_3 {
    public static void main(String[] args) {
        String encodedString = "Hello%20World";
        try {
            String decodedString = URLDecoder.decode(encodedString, "UTF-8");
            System.out.println(decodedString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
