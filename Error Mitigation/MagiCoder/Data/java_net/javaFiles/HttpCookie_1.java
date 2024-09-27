import java.net.HttpCookie;

public class HttpCookie_1 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        cookie.setComment("This is a comment");
        String comment = cookie.getComment();
        System.out.println(comment);
    }
}
