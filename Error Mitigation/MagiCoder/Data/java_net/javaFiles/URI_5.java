import java.net.URI;
import java.net.URISyntaxException;

public class URI_5 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://username:password@hostname:8080/path?query#ref");
            String authority = uri.getAuthority();
            System.out.println("Authority: " + authority);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
