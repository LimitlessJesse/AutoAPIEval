import java.net.HttpCookie;

public class HttpCookie_6 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        int version = cookie.getVersion();
        System.out.println("Version: " + version);
    }
}
