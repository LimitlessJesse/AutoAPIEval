import javax.security.auth.PrivateCredentialPermission;

public class PrivateCredentialPermission_3 {
    public static void main(String[] args) {
        PrivateCredentialPermission permission = new PrivateCredentialPermission("subject", "credential");
        int hashCode = permission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
