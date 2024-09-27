import java.security.*;

public class PermissionCollection_1 {
    public static void main(String[] args) {
        PermissionCollection permissionCollection = new PermissionCollection();
        Permission permission = new FilePermission("<<ALL FILES>>", "read");

        // Add a permission to the collection
        permissionCollection.add(permission);

        // Check if the collection implies the specified permission
        boolean implies = permissionCollection.implies(permission);

        System.out.println("Does the collection imply the permission? " + implies);
    }
}
