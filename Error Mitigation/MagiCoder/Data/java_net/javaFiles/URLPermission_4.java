import java.net.URLPermission;
import java.security.Permission;

public class URLPermission_4 {
    public static void main(String[] args) {
        URLPermission permission1 = new URLPermission("http://www.example.com");
        URLPermission permission2 = new URLPermission("http://www.example.com/path");

        boolean implies = permission1.implies(permission2);
        System.out.println(implies);
    }
}
