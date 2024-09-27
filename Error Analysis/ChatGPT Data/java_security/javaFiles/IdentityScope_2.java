import java.security.Identity;
import java.security.IdentityScope;

public class IdentityScope_2 {
    public static void main(String[] args) {
        IdentityScope scope = IdentityScope.getSystemScope();
        Identity identity = scope.getIdentity("Alice");
        System.out.println("Identity name: " + identity.getName());
    }
}
