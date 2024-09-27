import javax.security.auth.PrivateCredentialPermission;

public class PrivateCredentialPermission_4 {
    public static void main(String[] args) {
        PrivateCredentialPermission permission = new PrivateCredentialPermission("credential", "read");
        int hashCode = permission.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
