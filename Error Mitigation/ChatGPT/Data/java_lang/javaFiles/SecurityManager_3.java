import java.lang.SecurityManager;

public class SecurityManager_3 {
    public static void main(String[] args) {
        SecurityManager securityManager = new SecurityManager();
        try {
            securityManager.checkExit(0);
            System.out.println("Exiting with status 0");
        } catch (SecurityException e) {
            System.out.println("SecurityException: " + e.getMessage());
        }
    }
}
