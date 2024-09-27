import java.net.CookieManager;
import java.net.CookiePolicy;

public class CookieManager_3 {
    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        CookiePolicy cookiePolicy = CookiePolicy.ACCEPT_ALL;
        
        cookieManager.setCookiePolicy(cookiePolicy);
        
        System.out.println("Cookie policy set to: " + cookieManager.getCookiePolicy());
    }
}
