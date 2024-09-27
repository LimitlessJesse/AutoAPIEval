import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class PermissionCollection_2 {
    public static void main(String[] args) {
        PermissionCollection permissionCollection = new Permissions();
        Permission permission = new RuntimePermission("test");
        permissionCollection.add(permission);

        boolean implies = permissionCollection.implies(permission);
        System.out.println(implies);
    }
}
