import java.security.AccessControlContext;

public class AccessControlContext_2 {
    public static void main(String[] args) {
        AccessControlContext context1 = new AccessControlContext(null, null);
        AccessControlContext context2 = new AccessControlContext(null, null);
        
        boolean result = context1.equals(context2);
        System.out.println("Are the two access control contexts equal? " + result);
    }
}
