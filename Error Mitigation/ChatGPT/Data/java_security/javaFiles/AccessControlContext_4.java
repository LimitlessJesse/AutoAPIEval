import java.security.AccessControlContext;
import java.security.ProtectionDomain;

public class AccessControlContext_4 {
    public static void main(String[] args) {
        ProtectionDomain pd1 = new ProtectionDomain(null, null);
        ProtectionDomain pd2 = new ProtectionDomain(null, null);
        
        AccessControlContext context = new AccessControlContext(new ProtectionDomain[] {pd1, pd2});
        
        int hashCode = context.hashCode();
        System.out.println("Hash code value for the context: " + hashCode);
    }
}
