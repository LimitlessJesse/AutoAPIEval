import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

public class URLDecoder_1 {
    public static void main(String[] args) {
        String encodedString = "Hello%20World";
        try {
            String decodedString = URLDecoder.decode(encodedString, StandardCharsets.UTF_8.name());
            System.out.println(decodedString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
