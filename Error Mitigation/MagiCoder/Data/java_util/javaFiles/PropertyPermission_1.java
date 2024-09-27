import java.security.Permission;
import java.util.PropertyPermission;

public class PropertyPermission_1 {
    public static void main(String[] args) {
        // Create a PropertyPermission object
        PropertyPermission permission1 = new PropertyPermission("java.home", "read");

        // Create another PropertyPermission object
        PropertyPermission permission2 = new PropertyPermission("java.*", "read");

        // Check if permission2 implies permission1
        boolean implies = permission2.implies(permission1);

        // Print the result
        System.out.println(implies);
    }
}
