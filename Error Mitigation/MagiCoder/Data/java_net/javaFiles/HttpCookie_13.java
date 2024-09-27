import java.net.HttpCookie;

public class HttpCookie_13 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        cookie.setPath("/catalog");
        System.out.println("Cookie Path: " + cookie.getPath());
    }
}
