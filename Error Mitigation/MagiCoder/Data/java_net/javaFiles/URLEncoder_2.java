import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class URLEncoder_2 {
    public static void main(String[] args) {
        try {
            String s = "Hello World!";
            String encoded = URLEncoder.encode(s, "UTF-8");
            System.out.println(encoded);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
