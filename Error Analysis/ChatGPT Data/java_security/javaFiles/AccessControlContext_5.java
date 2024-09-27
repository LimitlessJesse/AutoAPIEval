import java.security.Permission;
import java.security.AccessControlContext;

public class AccessControlContext_5 {
    
    public static void main(String[] args) {
        // Create a sample Permission object
        Permission permission = new java.io.FilePermission("/tmp/test.txt", "read");
        
        // Create an AccessControlContext object
        AccessControlContext context = AccessController.getContext();
        
        // Check permission using checkPermission method
        context.checkPermission(permission);
    }
}
