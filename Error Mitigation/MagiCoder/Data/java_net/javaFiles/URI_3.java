import java.net.URI;
import java.net.URISyntaxException;

public class URI_3 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com");
            String scheme = uri.getScheme();
            System.out.println("Scheme: " + scheme);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
