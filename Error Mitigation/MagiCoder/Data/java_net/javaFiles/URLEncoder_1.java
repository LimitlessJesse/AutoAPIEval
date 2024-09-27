import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class URLEncoder_1 {
    public static void main(String[] args) {
        try {
            String s = "Hello World!";
            String enc = "UTF-8";
            String encoded = URLEncoder.encode(s, enc);
            System.out.println(encoded);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
