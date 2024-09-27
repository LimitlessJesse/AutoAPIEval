import java.net.CookieManager;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CookieManager_3 {
    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        URI uri = URI.create("https://example.com");
        Map<String, List<String>> responseHeaders = new HashMap<>();
        List<String> cookieValues = new ArrayList<>();
        cookieValues.add("cookie1=value1");
        cookieValues.add("cookie2=value2");
        responseHeaders.put("Set-Cookie2", cookieValues);

        try {
            cookieManager.put(uri, responseHeaders);
            System.out.println("Cookies set successfully.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
