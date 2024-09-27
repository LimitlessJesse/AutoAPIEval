import java.security.Permission;
import java.util.PropertyPermission;

public class PropertyPermission_4 {
    public static void main(String[] args) {
        // Create a new PropertyPermission
        PropertyPermission propertyPermission = new PropertyPermission("test", "read");

        // Create a new Permission
        Permission permission = new Permission("test") {
            @Override
            public boolean implies(Permission p) {
                return propertyPermission.implies(p);
            }
        };

        // Check if the permission implies another permission
        System.out.println(permission.implies(new PropertyPermission("test", "read")));
    }
}
