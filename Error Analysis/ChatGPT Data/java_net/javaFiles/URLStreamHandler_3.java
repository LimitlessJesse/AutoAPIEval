import java.net.URL;
import java.net.URLStreamHandler;

public class URLStreamHandler_3 {
    public static void main(String[] args) {
        URLStreamHandler handler = new URLStreamHandler() {
            protected URL setURL(URL u, String protocol, String host, int port, String authority, String userInfo, String path, String query, String ref) {
                return new URL(u, protocol, host, port, authority, userInfo, path, query, ref);
            }
        };

        // Example usage
        URL originalURL = new URL("http://example.com");
        URL newURL = handler.setURL(originalURL, "https", "example.com", 443, "example.com", "user:password", "/path", "query", "ref");

        System.out.println(newURL.toString());
    }
}
