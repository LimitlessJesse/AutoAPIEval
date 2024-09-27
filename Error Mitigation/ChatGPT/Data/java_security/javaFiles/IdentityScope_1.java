import java.security.Identity;
import java.security.IdentityScope;
import java.security.KeyManagementException;

public class IdentityScope_1 {
    public static void main(String[] args) {
        IdentityScope identityScope = IdentityScope.getSystemScope();
        Identity identity = new Identity("Alice", null);
        
        try {
            identityScope.addIdentity(identity);
        } catch (KeyManagementException e) {
            System.out.println("Error adding identity: " + e.getMessage());
        }
    }
}
