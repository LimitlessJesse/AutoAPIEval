import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class URLDecoder_2 {
    public static void main(String[] args) {
        String encodedString = "%E4%BD%A0%E5%A5%BD";
        String decodedString = "";

        try {
            decodedString = URLDecoder.decode(encodedString, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("Decoded String: " + decodedString);
    }
}
