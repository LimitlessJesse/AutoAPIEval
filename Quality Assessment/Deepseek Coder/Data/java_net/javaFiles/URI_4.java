import java.net.URI;
import java.net.URISyntaxException;

public class URI_4 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com");
            String scheme = uri.getScheme();
            System.out.println("Scheme: " + scheme);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
