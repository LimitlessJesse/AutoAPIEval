import java.net.HttpCookie;

public class HttpCookie_1 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("myCookie", "123");
        String name = cookie.getName();
        System.out.println("Cookie name: " + name);
    }
}
