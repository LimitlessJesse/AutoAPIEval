import java.net.URLPermission;

public class URLPermission_1 {
    public static void main(String[] args) {
        URLPermission permission = new URLPermission("http://example.com", "GET,POST", "Authorization");
        String actions = permission.getActions();
        System.out.println(actions);
    }
}
