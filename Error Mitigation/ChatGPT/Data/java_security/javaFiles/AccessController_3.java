import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.AccessControlContext;

public class AccessController_3 {
    public static void main(String[] args) {
        PrivilegedAction<String> action = new PrivilegedAction<String>() {
            public String run() {
                return "Hello from privileged action";
            }
        };
        
        AccessControlContext context = AccessController.getContext();
        
        String result = AccessController.doPrivileged(action, context);
        
        System.out.println(result);
    }
}
