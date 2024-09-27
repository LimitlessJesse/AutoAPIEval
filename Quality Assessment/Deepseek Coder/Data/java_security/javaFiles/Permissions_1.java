import java.security.Permission;
import java.security.Permissions;
import java.security.Policy;

public class Permissions_1 {
    public static void main(String[] args) {
        // Create a new Permissions object
        Permissions permissions = new Permissions();

        // Create a new Permission
        Permission permission = new RuntimePermission("createClassLoader");

        // Add the permission to the Permissions object
        permissions.add(permission);

        // Get the system policy
        Policy policy = Policy.getPolicy();

        // Check if the policy implies the permission
        boolean implies = policy.implies(permissions, permission);

        // Print the result
        System.out.println(implies);
    }
}
