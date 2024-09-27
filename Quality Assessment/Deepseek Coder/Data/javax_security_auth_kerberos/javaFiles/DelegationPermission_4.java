import javax.security.auth.kerberos.DelegationPermission;

public class DelegationPermission_4 {
    public static void main(String[] args) {
        DelegationPermission delegationPermission = new DelegationPermission("test");
        int hashCode = delegationPermission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
