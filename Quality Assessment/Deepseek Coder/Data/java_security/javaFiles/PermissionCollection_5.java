import java.security.PermissionCollection;
import java.security.Permissions;

public class PermissionCollection_5 {
    public static void main(String[] args) {
        PermissionCollection permissionCollection = new Permissions();
        permissionCollection.add(new RuntimePermission("createClassLoader"));
        System.out.println(permissionCollection);
        permissionCollection.setReadOnly();
        // This will throw an exception because the permission collection is read-only
        permissionCollection.add(new RuntimePermission("deleteTempFile"));
    }
}
