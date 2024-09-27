import java.security.Permission;
import java.security.Permissions;
import java.util.Enumeration;

public class Permissions_4 {
    public static void main(String[] args) {
        Permissions permissions = new Permissions();
        
        // Add some permissions to the Permissions object
        
        Enumeration<Permission> enumeration = permissions.elements();
        while (enumeration.hasMoreElements()) {
            Permission permission = enumeration.nextElement();
            System.out.println(permission);
        }
    }
}
