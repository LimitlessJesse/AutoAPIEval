import java.security.KeyStore;

public class KeyStore_PasswordProtection_1 {
    public static void main(String[] args) {
        KeyStore.PasswordProtection passwordProtection = new KeyStore.PasswordProtection("myPassword".toCharArray());
        char[] password = passwordProtection.getPassword();
        
        System.out.println(new String(password));
    }
}
