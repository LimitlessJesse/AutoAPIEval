import java.security.PermissionCollection;
import java.security.Policy;
import java.security.ProtectionDomain;

public class Policy_1 {
    public static void main(String[] args) {
        Policy policy = Policy.getPolicy();
        ProtectionDomain domain = new ProtectionDomain(null, null);
        PermissionCollection permissions = policy.getPermissions(domain);
        System.out.println(permissions);
    }
}
