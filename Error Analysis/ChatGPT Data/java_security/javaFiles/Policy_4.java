import java.security.PermissionCollection;
import java.security.ProtectionDomain;
import java.security.Policy;

public class Policy_4 {
    public static void main(String[] args) {
        Policy policy = Policy.getPolicy();
        ProtectionDomain domain = Main.class.getProtectionDomain();
        PermissionCollection permissions = policy.getPermissions(domain);
        // Use permissions as needed
    }
}
