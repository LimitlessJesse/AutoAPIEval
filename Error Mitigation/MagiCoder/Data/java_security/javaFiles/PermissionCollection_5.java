import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class PermissionCollection_5 {
    public static void main(String[] args) {
        PermissionCollection permissionCollection = new Permissions();
        System.out.println(permissionCollection.isReadOnly()); // false

        permissionCollection.add(new RuntimePermission("test"));
        System.out.println(permissionCollection.isReadOnly()); // false

        permissionCollection.setReadOnly();
        System.out.println(permissionCollection.isReadOnly()); // true

        try {
            permissionCollection.add(new RuntimePermission("test2"));
        } catch (SecurityException e) {
            System.out.println("Caught expected SecurityException: " + e.getMessage());
        }
    }
}
