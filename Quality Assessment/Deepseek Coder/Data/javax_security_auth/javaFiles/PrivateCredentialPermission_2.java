import javax.security.auth.PrivateCredentialPermission;

public class PrivateCredentialPermission_2 {
    public static void main(String[] args) {
        PrivateCredentialPermission permission1 = new PrivateCredentialPermission("", "");
        PrivateCredentialPermission permission2 = new PrivateCredentialPermission("", "");

        boolean isEqual = permission1.equals(permission2);

        System.out.println("Are the two permissions equal? " + isEqual);
    }
}
