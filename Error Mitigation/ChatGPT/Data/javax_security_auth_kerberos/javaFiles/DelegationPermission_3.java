import javax.security.auth.kerberos.DelegationPermission;

public class DelegationPermission_3 {
    public static void main(String[] args) {
        DelegationPermission permission1 = new DelegationPermission("subordinate1", "service1");
        DelegationPermission permission2 = new DelegationPermission("subordinate1", "service1");

        boolean result = permission1.equals(permission2);
        System.out.println("Are permission1 and permission2 equal? " + result);
    }
}
