import java.net.HttpCookie;

public class HttpCookie_3 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("myCookie", "cookieValue");
        cookie.setPath("/myPath");
        System.out.println("Path of the cookie is set to: " + cookie.getPath());
    }
}
