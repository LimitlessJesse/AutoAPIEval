import java.net.CookieManager;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CookieManager_1 {
    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        
        URI uri = URI.create("https://example.com");
        Map<String, List<String>> responseHeaders = new HashMap<>();
        List<String> cookies = new ArrayList<>();
        cookies.add("cookie1=value1");
        cookies.add("cookie2=value2");
        responseHeaders.put("Set-Cookie", cookies);
        
        cookieManager.put(uri, responseHeaders);
        
        System.out.println("Cookies added to CookieManager for URI: " + uri);
    }
}
