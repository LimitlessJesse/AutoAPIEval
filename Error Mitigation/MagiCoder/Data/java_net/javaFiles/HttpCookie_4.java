import java.net.HttpCookie;

public class HttpCookie_4 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        String name = cookie.getName();
        System.out.println("Cookie name: " + name);
    }
}
