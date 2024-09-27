import java.lang.SecurityManager;

public class SecurityManager_4 {
    public static void main(String[] args) {
        SecurityManager securityManager = new SecurityManager();
        try {
            securityManager.checkRead("example.txt");
            System.out.println("File read permission granted");
        } catch (SecurityException e) {
            System.out.println("SecurityException: File read permission denied");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: File argument is null");
        }
    }
}
