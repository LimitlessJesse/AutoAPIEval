import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class URLEncoder_1 {
    public static void main(String[] args) {
        try {
            String url = "https://example.com/search?q=java";
            String encodedUrl = URLEncoder.encode(url, StandardCharsets.UTF_8.toString());
            System.out.println(encodedUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
