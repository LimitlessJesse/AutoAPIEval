import java.lang.SecurityManager;

public class SecurityManager_2 {
    public static void main(String[] args) {
        SecurityManager securityManager = new SecurityManager();
        securityManager.checkCreateClassLoader();
    }
}
