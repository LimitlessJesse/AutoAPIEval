import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;

public class CookieHandler_2 {
    public static void main(String[] args) {
        CookieManager manager = new CookieManager();
        manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(manager);
    }
}
