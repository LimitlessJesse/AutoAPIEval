import java.net.URLPermission;
import java.security.Permission;

public class URLPermission_3 {
    public static void main(String[] args) {
        URLPermission urlPermission1 = new URLPermission("http://www.example.com/index.html");
        URLPermission urlPermission2 = new URLPermission("http://www.example.com/index.html");
        Permission permission = new URLPermission("http://www.example.com/index.html");

        boolean implies = urlPermission1.implies(permission);
        System.out.println(implies); // Output: true

        implies = urlPermission1.implies(urlPermission2);
        System.out.println(implies); // Output: true
    }
}
