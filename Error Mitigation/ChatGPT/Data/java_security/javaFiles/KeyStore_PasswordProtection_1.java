import java.security.KeyStore.PasswordProtection;

public class KeyStore_PasswordProtection_1 {
    public static void main(String[] args) {
        char[] password = "mySecretPassword".toCharArray();
        
        PasswordProtection protection = new PasswordProtection(password);
        char[] retrievedPassword = protection.getPassword();
        
        System.out.println("Retrieved password: " + new String(retrievedPassword));
    }
}
