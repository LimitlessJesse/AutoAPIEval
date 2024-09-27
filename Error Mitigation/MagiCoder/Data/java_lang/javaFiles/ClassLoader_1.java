import java.lang.reflect.Method;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.security.SecurityPermission;
import java.security.SecurityManager;

public class ClassLoader_1 {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        ClassLoader parentClassLoader = classLoader.getParent();

        System.out.println("Parent ClassLoader: " + parentClassLoader);

        // Check if a security manager is present and its checkPermission method doesn't allow access to this class loader's parent class loader.
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager!= null) {
            PermissionCollection permissions = securityManager.getPermissions();
            Permission permission = new SecurityPermission("getClassLoader");
            if (!permissions.implies(permission)) {
                throw new SecurityException("Access to the parent class loader is not permitted.");
            }
        }

        // Get the getParent method
        Method getParentMethod = ClassLoader.class.getDeclaredMethod("getParent");

        // Invoke the getParent method
        ClassLoader parent = (ClassLoader) getParentMethod.invoke(classLoader);

        System.out.println("Parent ClassLoader (via reflection): " + parent);
    }
}
