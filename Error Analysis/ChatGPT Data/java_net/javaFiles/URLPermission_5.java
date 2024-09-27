import java.security.Permission;
import java.net.URLPermission;

public class URLPermission_5 {
    public static void main(String[] args) {
        Permission permission = new URLPermission("http://www.example.com/*", "GET");
        String actions = permission.getActions();
        System.out.println(actions);
    }
}
