import java.security.Permission;
import java.security.Policy;
import java.security.ProtectionDomain;

public class Policy_5 {
    public static void main(String[] args) {
        // Create a sample ProtectionDomain and Permission
        ProtectionDomain domain = new ProtectionDomain(null, null);
        Permission permission = new java.io.FilePermission("/tmp/test.txt", "read");

        // Use boolean implies(ProtectionDomain domain, Permission permission) method
        Policy policy = Policy.getPolicy();
        boolean permissionGranted = policy.implies(domain, permission);

        // Display the result
        System.out.println("Permission granted: " + permissionGranted);
    }
}
