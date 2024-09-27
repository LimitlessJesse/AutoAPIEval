import java.net.CookieHandler;

public class CookieHandler_1 {
    public static void main(String[] args) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        System.out.println("System-wide cookie handler: " + cookieHandler);
    }
}
