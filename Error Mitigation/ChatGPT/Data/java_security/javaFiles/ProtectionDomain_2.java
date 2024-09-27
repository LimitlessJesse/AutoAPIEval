import java.security.PermissionCollection;
import java.security.ProtectionDomain;

public class ProtectionDomain_2 {
    public static void main(String[] args) {
        ProtectionDomain domain = ProtectionDomain_2.class.getProtectionDomain();
        PermissionCollection permissions = domain.getPermissions();
        System.out.println("Permissions for this domain: " + permissions);
    }
}
