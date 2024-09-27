import javax.management.MBeanServerPermission;
import java.security.PermissionCollection;

public class MBeanServerPermission_3 {
    public static void main(String[] args) {
        MBeanServerPermission permission = new MBeanServerPermission("permissionName");
        PermissionCollection collection = permission.newPermissionCollection();
        // Use the collection object as needed
    }
}
