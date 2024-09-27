import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class SecurityManager_2 {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager!= null) {
            Permission permission = new RuntimePermission("createClassLoader");
            securityManager.checkPermission(permission);
        }
    }
}
