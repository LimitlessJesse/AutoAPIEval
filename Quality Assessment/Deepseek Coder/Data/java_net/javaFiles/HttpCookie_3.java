import java.net.HttpCookie;

public class HttpCookie_3 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("myCookie", "");
        cookie.setValue("newValue");
        System.out.println("Cookie name: " + cookie.getName());
        System.out.println("Cookie value: " + cookie.getValue());
    }
}
