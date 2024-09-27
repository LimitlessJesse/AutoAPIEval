import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class Permission_1 {
    public static void main(String[] args) {
        Permission p1 = new java.lang.RuntimePermission("createClassLoader");
        Permission p2 = new java.lang.RuntimePermission("setSecurityManager");

        PermissionCollection pc = new Permissions();
        pc.add(p1);

        // Check if p2 implies p1
        boolean implies = pc.implies(p2);
        System.out.println(implies);
    }
}
