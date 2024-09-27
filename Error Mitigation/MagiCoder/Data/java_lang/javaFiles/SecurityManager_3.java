import java.lang.SecurityManager;

public class SecurityManager_3 {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager!= null) {
            try {
                securityManager.checkExit(0);
                System.out.println("Exit status 0 is allowed.");
            } catch (SecurityException e) {
                System.out.println("Exit status 0 is not allowed: " + e.getMessage());
            }
        } else {
            System.out.println("No security manager is set.");
        }
    }
}
