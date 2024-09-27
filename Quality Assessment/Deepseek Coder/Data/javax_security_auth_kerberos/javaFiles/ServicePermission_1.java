import javax.security.auth.kerberos.ServicePermission;
import java.security.Permission;

public class ServicePermission_1 {
    public static void main(String[] args) {
        // Create a new ServicePermission
        ServicePermission servicePermission = new ServicePermission("service", "actions");

        // Create a new Permission
        Permission permission = new ServicePermission("service", "actions");

        // Check if the servicePermission implies the permission
        boolean implies = servicePermission.implies(permission);

        // Print the result
        System.out.println(implies);
    }
}
