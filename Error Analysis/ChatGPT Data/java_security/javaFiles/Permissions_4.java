import java.security.Permission;
import java.security.Permissions;

public class Permissions_4 {
    public static void main(String[] args) {
        Permissions permissions = new Permissions();
        Permission permission = new RuntimePermission("myPermission");
        boolean result = permissions.implies(permission);
        System.out.println("Permission implied: " + result);
    }
}
