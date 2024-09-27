import javax.security.auth.PrivateCredentialPermission;
import java.security.Principal;
import java.util.Arrays;

public class PrivateCredentialPermission_2 {
    public static void main(String[] args) {
        Principal principal1 = new Principal() {
            @Override
            public String getName() {
                return "user1";
            }
        };
        Principal principal2 = new Principal() {
            @Override
            public String getName() {
                return "user2";
            }
        };

        PrivateCredentialPermission permission1 = new PrivateCredentialPermission("class1", new Principal[]{principal1, principal2});
        PrivateCredentialPermission permission2 = new PrivateCredentialPermission("class1", new Principal[]{principal2, principal1});

        System.out.println(permission1.equals(permission2)); // Output: true
    }
}
