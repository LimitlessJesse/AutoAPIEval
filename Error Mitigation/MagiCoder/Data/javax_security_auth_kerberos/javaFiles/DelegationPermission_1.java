import javax.security.auth.kerberos.DelegationPermission;
import java.security.Permission;

public class DelegationPermission_1 {
    public static void main(String[] args) {
        DelegationPermission delegationPermission = new DelegationPermission("test");
        Permission permission = new Permission("test") {
            @Override
            public boolean implies(Permission p) {
                return delegationPermission.implies(p);
            }
        };

        System.out.println(permission.implies(new DelegationPermission("test")));
    }
}
