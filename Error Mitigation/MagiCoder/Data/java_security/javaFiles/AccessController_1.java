import java.security.AccessController;
import java.security.Permission;
import java.security.AccessControlException;

public class AccessController_1 {
    public static void main(String[] args) {
        try {
            AccessController.checkPermission(new RuntimePermission("createClassLoader"));
            System.out.println("Permission granted");
        } catch (AccessControlException e) {
            System.out.println("Permission denied: " + e.getMessage());
        }
    }
}
