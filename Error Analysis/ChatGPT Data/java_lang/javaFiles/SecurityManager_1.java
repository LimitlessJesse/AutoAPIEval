import java.security.SecurityManager;

public class SecurityManager_1 {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkAccept("localhost", 8080);
            System.out.println("Access allowed for host 'localhost' at port 8080");
        } else {
            System.out.println("No SecurityManager set");
        }
    }
}
