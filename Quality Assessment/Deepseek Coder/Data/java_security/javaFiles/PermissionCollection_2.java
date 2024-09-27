import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class PermissionCollection_2 {
    public static void main(String[] args) {
        PermissionCollection permissionCollection = new Permissions();
        Permission permission = new Permission("read");
        permissionCollection.add(permission);
        System.out.println(permissionCollection);
    }
}
