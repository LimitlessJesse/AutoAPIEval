import java.security.PermissionCollection;
import java.security.Permission;
import java.security.Permissions;

public class PermissionCollection_4 {
    public static void main(String[] args) {
        PermissionCollection permissionCollection = new Permissions();
        permissionCollection.add(new RuntimePermission("createClassLoader"));
        System.out.println(permissionCollection);
        permissionCollection.setReadOnly();
        try {
            permissionCollection.add(new RuntimePermission("createClassLoader"));
        } catch (SecurityException e) {
            System.out.println("PermissionCollection is read-only. Cannot add new permission.");
        }
    }
}
