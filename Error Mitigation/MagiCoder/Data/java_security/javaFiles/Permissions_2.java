import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class Permissions_2 {
    public static void main(String[] args) {
        PermissionCollection permissions = new Permissions();
        permissions.add(new java.io.FilePermission("/tmp", "read,write"));
        permissions.add(new java.io.FilePermission("/tmp/scratch/foo", "read,write"));

        Permission permission = new java.io.FilePermission("/tmp/scratch/foo", "read,write");
        boolean implies = permissions.implies(permission);

        System.out.println(implies);
    }
}
