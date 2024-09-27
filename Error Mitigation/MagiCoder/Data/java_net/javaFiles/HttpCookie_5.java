import java.net.HttpCookie;

public class HttpCookie_5 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        cookie.setPath("/path");
        String path = cookie.getPath();
        System.out.println("Path: " + path);
    }
}
