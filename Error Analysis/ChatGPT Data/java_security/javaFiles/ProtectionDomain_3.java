import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.ProtectionDomain;

public class ProtectionDomain_3 {
    public static void main(String[] args) {
        ProtectionDomain pd = Main.class.getProtectionDomain();
        CodeSource cs = pd.getCodeSource();
        PermissionCollection pc = pd.getPermissions();
        
        System.out.println("Permissions for the ProtectionDomain:");
        System.out.println(pc.elements());
    }
}
