import java.net.URL;
import java.net.URLStreamHandler;

public class URLStreamHandler_2 {
    public static void main(String[] args) {
        URL url = new URL("https://www.example.com");
        String spec = url.toString();
        int start = 0;
        int limit = spec.length();
        
        URLStreamHandler handler = url.getURLStreamHandler();
        handler.parseURL(url, spec, start, limit);
    }
}
