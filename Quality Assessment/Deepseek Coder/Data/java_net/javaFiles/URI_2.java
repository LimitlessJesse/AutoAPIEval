import java.net.URI;
import java.net.URISyntaxException;

public class URI_2 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com/");
            boolean isAbsolute = uri.isAbsolute();
            System.out.println("Is the URI absolute? " + isAbsolute);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
