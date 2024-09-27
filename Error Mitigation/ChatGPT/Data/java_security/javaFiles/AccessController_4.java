import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.security.AccessControlContext;
import java.security.PrivilegedActionException;

public class AccessController_4 {
    public static void main(String[] args) {
        try {
            String result = AccessController.doPrivileged(new PrivilegedExceptionAction<String>() {
                public String run() throws Exception {
                    return "Hello, World!";
                }
            }, AccessController.getContext());
            
            System.out.println(result);
        } catch (PrivilegedActionException e) {
            e.printStackTrace();
        }
    }
}
