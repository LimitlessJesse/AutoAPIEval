import javax.security.auth.kerberos.DelegationPermission;
import java.security.Permission;

public class DelegationPermission_2 {
    public static void main(String[] args) {
        DelegationPermission delegationPermission = new DelegationPermission("delegate", "forwardable, proxiable");
        Permission permission = new DelegationPermission("delegate", "forwardable");

        boolean implied = delegationPermission.implies(permission);
        System.out.println("Permission implied: " + implied);
    }
}
