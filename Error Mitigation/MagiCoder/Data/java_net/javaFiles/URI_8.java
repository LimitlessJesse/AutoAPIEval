import java.net.URI;
import java.net.URISyntaxException;

public class URI_8 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://example.com/path#fragment");
            String fragment = uri.getFragment();
            System.out.println("Fragment: " + fragment);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
