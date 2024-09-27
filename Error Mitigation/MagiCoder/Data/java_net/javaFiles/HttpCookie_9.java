import java.net.HttpCookie;

public class HttpCookie_9 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        String value = cookie.getValue();
        System.out.println(value);
    }
}
