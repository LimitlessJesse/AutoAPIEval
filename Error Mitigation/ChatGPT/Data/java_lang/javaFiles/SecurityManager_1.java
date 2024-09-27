import java.security.Permission;
import java.lang.SecurityManager;

public class SecurityManager_1 {
    public static void main(String[] args) {
        SecurityManager securityManager = new SecurityManager();
        Permission permission = new Permission("example_permission");
        
        try {
            securityManager.checkPermission(permission);
            System.out.println("Permission granted");
        } catch (SecurityException e) {
            System.out.println("Permission denied");
        } catch (NullPointerException e) {
            System.out.println("Permission argument is null");
        }
    }
}
