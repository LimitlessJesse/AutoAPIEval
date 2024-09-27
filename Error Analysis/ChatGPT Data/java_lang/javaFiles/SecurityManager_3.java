import java.lang.SecurityManager;

public class SecurityManager_3 {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPrintJobAccess();
            System.out.println("Print job access granted.");
        } else {
            System.out.println("No security manager exists.");
        }
    }
}
