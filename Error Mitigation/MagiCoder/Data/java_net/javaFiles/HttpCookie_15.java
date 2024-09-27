import java.net.HttpCookie;

public class HttpCookie_15 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        cookie.setHttpOnly(true);
        System.out.println("HttpOnly: " + cookie.isHttpOnly());
    }
}
