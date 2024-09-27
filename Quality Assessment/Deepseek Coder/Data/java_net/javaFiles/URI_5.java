import java.net.URI;
import java.net.URISyntaxException;

public class URI_5 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com/path?query=param");
            String schemeSpecificPart = uri.getSchemeSpecificPart();
            System.out.println(schemeSpecificPart);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
