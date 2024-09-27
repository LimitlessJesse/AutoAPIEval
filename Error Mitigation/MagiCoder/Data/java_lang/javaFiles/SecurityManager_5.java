import java.lang.SecurityManager;

public class SecurityManager_5 {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager!= null) {
            try {
                securityManager.checkLink("myLibrary");
                System.out.println("Library loaded successfully");
            } catch (SecurityException e) {
                System.out.println("Security exception: " + e.getMessage());
            }
        } else {
            System.out.println("No security manager is set");
        }
    }
}
