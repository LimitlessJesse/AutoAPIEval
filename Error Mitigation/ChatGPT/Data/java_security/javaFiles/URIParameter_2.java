import java.net.URI;
import java.security.URIParameter;

public class URIParameter_2 {
    public static void main(String[] args) {
        URI uri = URI.create("https://www.example.com");
        URIParameter uriParam = new URIParameter(uri);
        
        System.out.println("URI: " + uriParam.getURI());
    }
}
