import java.net.CookieManager;
import java.net.CookiePolicy;

public class CookieManager_2 {
    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
    }
}
