import javax.security.auth.kerberos.DelegationPermission;

public class DelegationPermission_4 {
    public static void main(String[] args) {
        DelegationPermission permission = new DelegationPermission("example", "forwardable");
        int hashCode = permission.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
