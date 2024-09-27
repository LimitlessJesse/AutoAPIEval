import java.security.KeyStore;

public class KeyStore_PasswordProtection_3 {
    public static void main(String[] args) {
        KeyStore.PasswordProtection passwordProtection = new KeyStore.PasswordProtection("password".toCharArray());
        boolean isDestroyed = passwordProtection.isDestroyed();
        System.out.println("Is password destroyed? " + isDestroyed);
    }
}
