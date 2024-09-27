import java.net.HttpCookie;

public class HttpCookie_5 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("myCookie", "123");
        cookie.setDomain("example.com");
        System.out.println("Domain: " + cookie.getDomain());
    }
}
