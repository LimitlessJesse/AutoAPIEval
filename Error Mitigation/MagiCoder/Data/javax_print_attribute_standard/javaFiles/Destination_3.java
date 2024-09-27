import javax.print.attribute.standard.Destination;
import java.net.URI;
import java.net.URISyntaxException;

public class Destination_3 {
    public static void main(String[] args) throws URISyntaxException {
        Destination dest1 = new Destination("http://example.com", new URI("http://example.com"));
        Destination dest2 = new Destination("http://example.com", new URI("http://example.com"));
        Destination dest3 = new Destination("http://example.org", new URI("http://example.org"));

        System.out.println(dest1.equals(dest2)); // true
        System.out.println(dest1.equals(dest3)); // false
    }
}
