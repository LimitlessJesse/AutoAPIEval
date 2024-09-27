import java.net.HttpCookie;

public class HttpCookie_2 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        cookie.setDomain("example.com");
        String domain = cookie.getDomain();
        System.out.println("Domain: " + domain);
    }
}
