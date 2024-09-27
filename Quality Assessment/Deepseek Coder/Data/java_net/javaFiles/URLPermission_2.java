import java.net.URLPermission;

public class URLPermission_2 {
    public static void main(String[] args) {
        URLPermission urlPermission = new URLPermission("http://www.example.com");
        String actions = urlPermission.getActions();
        System.out.println(actions);
    }
}
