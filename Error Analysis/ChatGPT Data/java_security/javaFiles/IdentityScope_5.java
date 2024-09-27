import java.security.Identity;
import java.security.IdentityScope;

public class IdentityScope_5 {
    public static void main(String[] args) {
        Identity identityToRemove = new Identity("ExampleIdentity", null);
        IdentityScope identityScope = IdentityScope.getSystemScope();
        identityScope.removeIdentity(identityToRemove);
    }
}
