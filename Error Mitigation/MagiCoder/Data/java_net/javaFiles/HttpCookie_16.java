import java.net.HttpCookie;

public class HttpCookie_16 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("myCookie", "");
        cookie.setValue("myValue");
        System.out.println("Cookie Name: " + cookie.getName());
        System.out.println("Cookie Value: " + cookie.getValue());
    }
}
