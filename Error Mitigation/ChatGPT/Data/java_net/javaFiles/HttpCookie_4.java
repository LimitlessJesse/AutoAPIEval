import java.net.HttpCookie;

public class HttpCookie_4 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("myCookie", "cookieValue");
        cookie.setMaxAge(3600); // Set the maximum age of the cookie to 1 hour (3600 seconds)
        System.out.println("Cookie max age: " + cookie.getMaxAge());
    }
}
