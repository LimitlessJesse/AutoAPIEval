import java.security.Permission;
import java.security.Permissions;

public class Permissions_1 {
    public static void main(String[] args) {
        Permissions permissions = new Permissions();
        
        // Creating a new Permission
        Permission permission = new java.io.FilePermission("/tmp/*", "read");

        // Adding the Permission to the Permissions collection
        permissions.add(permission);
        
        System.out.println("Added permission: " + permission);
    }
}
