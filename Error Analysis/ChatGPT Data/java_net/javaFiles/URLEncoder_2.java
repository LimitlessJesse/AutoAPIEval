import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class URLEncoder_2 {
    public static void main(String[] args) {
        String input = "Hello World";
        String encoding = "UTF-8";

        try {
            String encodedString = URLEncoder.encode(input, encoding);
            System.out.println("Encoded String: " + encodedString);
        } catch (UnsupportedEncodingException e) {
            System.err.println("Unsupported Encoding: " + encoding);
        }
    }
}
