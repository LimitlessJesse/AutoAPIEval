import javax.security.auth.PrivateCredentialPermission;

public class PrivateCredentialPermission_2 {
    public static void main(String[] args) {
        PrivateCredentialPermission permission = new PrivateCredentialPermission("credential", "read");
        String actions = permission.getActions();
        System.out.println(actions); // Output: read
    }
}
