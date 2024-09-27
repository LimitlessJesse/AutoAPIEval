import java.security.*;
import java.util.Enumeration;

public class PermissionCollection_3 {
    public static void main(String[] args) {
        PermissionCollection permissionCollection = new PermissionCollection();
        permissionCollection.add(new FilePermission("read", "write"));

        Enumeration<Permission> permissionEnumeration = permissionCollection.elements();

        while (permissionEnumeration.hasMoreElements()) {
            Permission permission = permissionEnumeration.nextElement();
            System.out.println(permission);
        }
    }
}
