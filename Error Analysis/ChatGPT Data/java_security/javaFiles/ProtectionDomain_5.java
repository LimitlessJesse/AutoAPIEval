import java.security.Permission;
import java.security.ProtectionDomain;

public class ProtectionDomain_5 {
    
    public static void main(String[] args) {
        Permission permission = new java.io.FilePermission("/tmp/*", "read");
        ProtectionDomain domain = new ProtectionDomain(null, null);
        
        boolean result = domain.implies(permission);
        System.out.println("Does the ProtectionDomain imply the permission? " + result);
    }
}
