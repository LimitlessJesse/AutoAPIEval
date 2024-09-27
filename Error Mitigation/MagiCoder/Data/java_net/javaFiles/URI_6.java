import java.net.URI;
import java.net.URISyntaxException;

public class URI_6 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://example.com/path/to/resource");
            String path = uri.getPath();
            System.out.println("Path: " + path);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
