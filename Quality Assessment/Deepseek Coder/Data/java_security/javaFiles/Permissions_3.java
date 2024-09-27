import java.security.Permission;
import java.security.Permissions;
import java.util.Enumeration;

public class Permissions_3 {
    public static void main(String[] args) {
        Permissions permissions = new Permissions();
        permissions.add(new RuntimePermission("createClassLoader"));
        permissions.add(new RuntimePermission("accessClassInPackage.java.lang"));

        Enumeration<Permission> permissionEnumeration = permissions.elements();

        while (permissionEnumeration.hasMoreElements()) {
            Permission permission = permissionEnumeration.nextElement();
            System.out.println(permission.getName());
        }
    }
}
