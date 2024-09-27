import java.net.CookieHandler;
import java.net.URI;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CookieHandler_4 {
    public static void main(String[] args) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        URI uri = URI.create("https://example.com");
        Map<String, List<String>> responseHeaders = Map.of("Set-Cookie2", List.of("cookie1=value1", "cookie2=value2"));
        
        try {
            cookieHandler.put(uri, responseHeaders);
            System.out.println("Cookies set successfully");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        }
    }
}
