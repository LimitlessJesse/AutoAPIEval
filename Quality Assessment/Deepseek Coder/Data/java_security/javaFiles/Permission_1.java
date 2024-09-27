import java.security.Permission;
import java.security.Permissions;

public class Permission_1 {
    public static void main(String[] args) {
        Permissions permissions = new Permissions();
        Permission writePermission = new RuntimePermission("write");
        permissions.add(writePermission);

        Permission readPermission = new RuntimePermission("read");
        boolean implies = permissions.implies(readPermission);
        System.out.println(implies);
    }
}
