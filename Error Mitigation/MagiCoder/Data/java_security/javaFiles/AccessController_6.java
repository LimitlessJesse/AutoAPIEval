import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

public class AccessController_6 {
    public static void main(String[] args) {
        try {
            String result = AccessController.doPrivileged(new PrivilegedExceptionAction<String>() {
                @Override
                public String run() throws Exception {
                    // Your code here
                    return "Hello, World!";
                }
            });
            System.out.println(result);
        } catch (PrivilegedActionException e) {
            e.printStackTrace();
        }
    }
}
