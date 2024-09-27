import java.net.HttpCookie;

public class HttpCookie_14 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        cookie.setSecure(true);
        System.out.println("Secure: " + cookie.getSecure());
    }
}
