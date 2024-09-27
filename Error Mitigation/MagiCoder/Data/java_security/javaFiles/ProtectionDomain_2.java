import java.security.PermissionCollection;
import java.security.ProtectionDomain;

public class ProtectionDomain_2 {
    public static void main(String[] args) {
        ProtectionDomain domain = new ProtectionDomain(null, null);
        PermissionCollection permissions = domain.getPermissions();
        System.out.println(permissions);
    }
}
