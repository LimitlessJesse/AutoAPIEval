import java.security.KeyStore.PasswordProtection;
import java.security.DestroyFailedException;

public class KeyStore_PasswordProtection_2 {
    public static void main(String[] args) {
        PasswordProtection passwordProtection = new PasswordProtection("password".toCharArray());
        
        try {
            passwordProtection.destroy();
            System.out.println("Password cleared successfully.");
        } catch (DestroyFailedException e) {
            System.out.println("Failed to clear password: " + e.getMessage());
        }
    }
}
