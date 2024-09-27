import javax.security.auth.kerberos.DelegationPermission;
import java.security.Permission;

public class DelegationPermission_1 {
    public static void main(String[] args) {
        // Create a DelegationPermission
        DelegationPermission delegationPermission = new DelegationPermission("delegate");

        // Create a Permission
        Permission permission = new DelegationPermission("delegate");

        // Check if the DelegationPermission implies the Permission
        boolean implies = delegationPermission.implies(permission);

        // Print the result
        System.out.println(implies);
    }
}
