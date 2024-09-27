import java.net.HttpCookie;

public class HttpCookie_2 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("myCookie", "myValue");
        String value = cookie.getValue();
        System.out.println(value);
    }
}
