import java.net.URI;
import java.net.URISyntaxException;

public class URI_4 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com/path?query#fragment");
            String schemeSpecificPart = uri.getSchemeSpecificPart();
            System.out.println(schemeSpecificPart);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
