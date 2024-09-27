import java.net.HttpCookie;

public class HttpCookie_7 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        cookie.setSecure(true);
        boolean isSecure = cookie.getSecure();
        System.out.println("Is the cookie secure? " + isSecure);
    }
}
