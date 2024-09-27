import java.net.URI;
import java.net.URISyntaxException;

public class URISyntax_14 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com");
            System.out.println(uri.toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
