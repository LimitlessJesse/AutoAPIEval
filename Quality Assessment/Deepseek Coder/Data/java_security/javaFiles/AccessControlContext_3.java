import java.security.AccessControlContext;
import java.security.Permission;
import java.security.AccessControlException;

public class AccessControlContext_3 {
    public static void main(String[] args) {
        AccessControlContext acc = new AccessControlContext(null);
        Permission perm = new RuntimePermission("accessDeclaredMembers");
        try {
            acc.checkPermission(perm);
            System.out.println("Permission granted");
        } catch (AccessControlException e) {
            System.out.println("Permission denied");
        }
    }
}
