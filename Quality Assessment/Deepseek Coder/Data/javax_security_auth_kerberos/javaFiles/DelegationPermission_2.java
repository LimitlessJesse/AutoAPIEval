import javax.security.auth.kerberos.DelegationPermission;

public class DelegationPermission_2 {
    public static void main(String[] args) {
        // Create two DelegationPermission objects
        DelegationPermission permission1 = new DelegationPermission("principal1", "actions1", "policy1");
        DelegationPermission permission2 = new DelegationPermission("principal2", "actions2", "policy2");

        // Compare the two DelegationPermission objects
        boolean isEqual = permission1.equals(permission2);

        // Print the result
        System.out.println("Are the two DelegationPermission objects equal? " + isEqual);
    }
}
