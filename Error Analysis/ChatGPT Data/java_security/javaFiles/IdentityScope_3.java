import java.security.Identity;
import java.security.IdentityScope;

public class IdentityScope_3 {
    public static void main(String[] args) {
        try {
            Identity identity = IdentityScope.getIdentity(null);
            System.out.println("Identity: " + identity);
        } catch (SecurityException e) {
            System.out.println("SecurityException: " + e.getMessage());
        }
    }
}
