import java.net.URI;
import java.net.URISyntaxException;

public class URISyntax_15 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com");
            String str = uri.toString();
            System.out.println(str);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
