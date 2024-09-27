import java.security.Permission;
import java.security.Permissions;

public class Permissions_1 {
    public static void main(String[] args) {
        Permissions permissions = new Permissions();
        Permission permission = new FilePermission("/path/to/file", "read");
        permissions.add(permission);
    }
}
