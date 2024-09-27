import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

public class AccessController_8 {
    public static void main(String[] args) {
        try {
            String result = AccessController.doPrivileged(new PrivilegedExceptionAction<String>() {
                public String run() throws Exception {
                    return "Hello, World!";
                }
            }, null);
            System.out.println(result);
        } catch (PrivilegedActionException e) {
            e.printStackTrace();
        }
    }
}
