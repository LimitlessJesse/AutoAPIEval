import java.security.Identity;
import java.security.IdentityScope;
import java.security.KeyManagementException;

public class IdentityScope_5 {
    public static void main(String[] args) {
        IdentityScope identityScope = IdentityScope.getSystemScope();
        Identity identity = new Identity("TestIdentity", null);
        
        try {
            identityScope.removeIdentity(identity);
            System.out.println("Identity removed successfully");
        } catch (KeyManagementException e) {
            System.out.println("Error removing identity: " + e.getMessage());
        }
    }
}
