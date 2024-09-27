import java.net.CookieStore;
import java.net.CookieManager;
import java.util.List;
import java.net.HttpCookie;

public class CookieManager_5 {
    public static void main(String[] args) {
        CookieManager manager = new CookieManager();
        CookieStore store = manager.getCookieStore();
        
        List<HttpCookie> cookies = store.getCookies();
        
        for(HttpCookie cookie : cookies) {
            System.out.println(cookie.getName() + " : " + cookie.getValue());
        }
    }
}
