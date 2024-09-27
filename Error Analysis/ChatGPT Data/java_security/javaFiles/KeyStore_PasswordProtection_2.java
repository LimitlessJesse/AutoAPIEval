import java.security.KeyStore.PasswordProtection;

public class KeyStore_PasswordProtection_2 {
    public static void main(String[] args) {
        PasswordProtection protection = new PasswordProtection("password".toCharArray());
        protection.destroy();
        System.out.println("Password has been destroyed.");
    }
}
