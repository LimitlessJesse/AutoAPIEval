import java.net.URI;
import java.net.URISyntaxException;

public class URI_7 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://example.com/path?query=value");
            String query = uri.getQuery();
            System.out.println(query);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
