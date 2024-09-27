import java.security.Identity;
import java.security.IdentityScope;

public class IdentityScope_1 {
    public static void main(String[] args) {
        IdentityScope scope = new IdentityScope();
        Identity identity = new Identity("Alice", null);
        
        scope.addIdentity(identity);
        
        System.out.println("Identity added to scope: " + scope.getIdentity("Alice"));
    }
}
