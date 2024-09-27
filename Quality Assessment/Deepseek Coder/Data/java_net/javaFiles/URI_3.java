import java.net.URI;

public class URI_3 {
    public static void main(String[] args) {
        try {
            URI baseUri = new URI("http://www.example.com/path/to/base");
            URI uri = new URI("http://www.example.com/path/to/resource");
            URI relativeUri = baseUri.relativize(uri);
            System.out.println(relativeUri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
