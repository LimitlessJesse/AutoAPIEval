import java.net.*;
import java.util.*;

public class CookieHandler_5 {
    public static void main(String[] args) {
        CookieHandler.setDefault(new CookieManager());
        CookieHandler handler = CookieHandler.getDefault();

        try {
            URI uri = new URI("http://example.com");
            Map<String, List<String>> headers = new HashMap<>();
            headers.put("Set-Cookie", Arrays.asList("cookie1=value1", "cookie2=value2"));

            handler.put(uri, headers);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
