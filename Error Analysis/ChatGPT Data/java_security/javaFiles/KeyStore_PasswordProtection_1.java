import java.security.KeyStore;
import java.security.KeyStore.PasswordProtection;
import java.util.Arrays;

public class KeyStore_PasswordProtection_1 {
    public static void main(String[] args) {
        char[] password = "secretpassword".toCharArray();
        PasswordProtection passwordProtection = new PasswordProtection(password);
        
        char[] retrievedPassword = passwordProtection.getPassword();
        System.out.println("Retrieved password: " + Arrays.toString(retrievedPassword));
    }
}
