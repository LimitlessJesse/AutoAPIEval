import java.net.HttpCookie;

public class HttpCookie_5 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("myCookie", "cookieValue");
        cookie.setSecure(true);
        System.out.println("Is cookie secure? " + cookie.getSecure());
    }
}
