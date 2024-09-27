import java.security.AccessControlContext;
import java.security.ProtectionDomain;

public class AccessControlContext_3 {
    public static void main(String[] args) {
        ProtectionDomain[] domains = new ProtectionDomain[1];
        AccessControlContext context1 = new AccessControlContext(domains);
        AccessControlContext context2 = new AccessControlContext(domains);
        
        boolean result = context1.equals(context2);
        System.out.println("Are the contexts equal? " + result);
    }
}
