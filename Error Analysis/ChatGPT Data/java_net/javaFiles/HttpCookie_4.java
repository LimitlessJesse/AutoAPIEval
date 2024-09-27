import java.net.HttpCookie;

public class HttpCookie_4 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        cookie.setSecure(true);
        System.out.println("Is Secure: " + cookie.getSecure());
    }
}
