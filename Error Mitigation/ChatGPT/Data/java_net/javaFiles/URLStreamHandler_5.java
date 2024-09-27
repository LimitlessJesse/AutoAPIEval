import java.net.URL;
import java.net.URLStreamHandler;

public class URLStreamHandler_5 {
    public static void main(String[] args) {
        URLStreamHandler handler = new URLStreamHandler() {
            @Override
            protected int hashCode(URL u) {
                // Custom hash calculation based on URL object
                return u.hashCode();
            }
        };

        URL url = new URL("http://www.example.com");
        int hash = handler.hashCode(url);
        System.out.println("Hash code for URL: " + hash);
    }
}
