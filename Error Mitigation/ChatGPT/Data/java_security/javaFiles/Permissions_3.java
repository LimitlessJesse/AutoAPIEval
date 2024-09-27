import java.security.Permission;
import java.security.Permissions;

public class Permissions_3 {
    public static void main(String[] args) {
        Permissions permissions = new Permissions();
        // Add permissions to the Permissions object
        
        Permission permissionToCheck = new Permission("example_permission");
        boolean isImplied = permissions.implies(permissionToCheck);
        System.out.println("Permission is implied: " + isImplied);
    }
}
