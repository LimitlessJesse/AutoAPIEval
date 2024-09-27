import java.net.HttpCookie;

public class HttpCookie_10 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        cookie.setComment("This is a comment");
        System.out.println("Comment: " + cookie.getComment());
    }
}
