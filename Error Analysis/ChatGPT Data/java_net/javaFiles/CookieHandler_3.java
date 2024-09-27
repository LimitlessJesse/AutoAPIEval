import java.net.CookieHandler;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CookieHandler_3 {
    public static void main(String[] args) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        
        URI uri = URI.create("http://example.com");
        Map<String, List<String>> responseHeaders = new HashMap<>();
        List<String> cookies = new ArrayList<>();
        cookies.add("cookie1=12345");
        cookies.add("cookie2=abcd");
        
        responseHeaders.put("Set-Cookie", cookies);
        
        cookieHandler.put(uri, responseHeaders);
    }
}
