import javax.security.auth.PrivateCredentialPermission;

public class PrivateCredentialPermission_4 {
    public static void main(String[] args) {
        PrivateCredentialPermission permission = new PrivateCredentialPermission("subject", "actions");
        System.out.println(permission.getActions());
    }
}
