import java.net.CookieHandler;

public class CookieHandler_1 {
    public static void main(String[] args) {
        CookieHandler handler = CookieHandler.getDefault();
        System.out.println("Default cookie handler: " + handler);
    }
}
