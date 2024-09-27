import java.net.HttpCookie;

public class HttpCookie_3 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("session", "12345");
        cookie.setPath("/catalog");
        System.out.println("Cookie path set to: " + cookie.getPath());
    }
}
