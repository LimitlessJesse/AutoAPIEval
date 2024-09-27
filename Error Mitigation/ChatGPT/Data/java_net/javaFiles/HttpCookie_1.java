import java.net.HttpCookie;

public class HttpCookie_1 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("myCookie", "cookieValue");
        String cookieName = cookie.getName();
        System.out.println("Cookie Name: " + cookieName);
    }
}
