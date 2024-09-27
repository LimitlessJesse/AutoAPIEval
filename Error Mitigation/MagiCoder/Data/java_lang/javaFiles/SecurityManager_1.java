import java.lang.reflect.Permission;
import java.lang.SecurityManager;

public class SecurityManager_1 {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager!= null) {
            try {
                securityManager.checkPermission(new RuntimePermission("createClassLoader"));
                System.out.println("Permission granted");
            } catch (SecurityException e) {
                System.out.println("Permission denied");
            }
        } else {
            System.out.println("No security manager is present");
        }
    }
}
