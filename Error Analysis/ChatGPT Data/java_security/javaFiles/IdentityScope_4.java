import java.security.IdentityScope;
import java.security.Identity;
import java.util.Enumeration;

public class IdentityScope_4 {
    public static void main(String[] args) {
        IdentityScope scope = IdentityScope.getSystemScope();
        Enumeration<Identity> identities = scope.identities();
        
        while (identities.hasMoreElements()) {
            Identity identity = identities.nextElement();
            System.out.println(identity.getName());
        }
    }
}
