import java.net.URI;
import java.net.URISyntaxException;

public class URI_1 {
    public static void main(String[] args) {
        try {
            URI baseURI = new URI("http://www.example.com/base/");
            URI relativeURI = new URI("relative/path");
            URI resolvedURI = baseURI.resolve(relativeURI.toString());
            System.out.println(resolvedURI);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
