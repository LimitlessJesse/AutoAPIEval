import java.security.AccessControlContext;

public class AccessControlContext_3 {
    public static void main(String[] args) {
        AccessControlContext context = new AccessControlContext();
        int hashCode = context.hashCode();
        System.out.println("HashCode of AccessControlContext: " + hashCode);
    }
}
