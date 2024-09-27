import javax.security.auth.PrivateCredentialPermission;

public class PrivateCredentialPermission_3 {
    public static void main(String[] args) {
        PrivateCredentialPermission permission1 = new PrivateCredentialPermission("credential", "read");
        PrivateCredentialPermission permission2 = new PrivateCredentialPermission("credential", "read");

        boolean result = permission1.equals(permission2);
        System.out.println("Are the permissions equal? " + result);
    }
}
