import javax.security.auth.kerberos.DelegationPermission;

public class DelegationPermission_2 {
    public static void main(String[] args) {
        DelegationPermission permission1 = new DelegationPermission("sub", "service");
        DelegationPermission permission2 = new DelegationPermission("sub", "service");
        DelegationPermission permission3 = new DelegationPermission("otherSub", "service");
        DelegationPermission permission4 = new DelegationPermission("sub", "otherService");

        System.out.println(permission1.equals(permission2)); // true
        System.out.println(permission1.equals(permission3)); // false
        System.out.println(permission1.equals(permission4)); // false
    }
}
