import java.lang.SecurityManager;

public class SecurityManager_2 {
    public static void main(String[] args) {
        SecurityManager sm = new SecurityManager();
        sm.checkListen(8080); // Check if listening on port 8080 is allowed
    }
}
