import java.security.AccessController;
import java.security.AccessControlContext;

public class AccessController_5 {
    public static void main(String[] args) {
        AccessControlContext context = AccessController.getContext();
        System.out.println("AccessControlContext: " + context.toString());
    }
}
