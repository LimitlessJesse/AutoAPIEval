import java.security.KeyStore;
import java.security.KeyStoreException;

public class KeyStore_1 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            System.out.println("KeyStore type: " + keyStore.getType());
        } catch (KeyStoreException e) {
            System.out.println("KeyStoreException: " + e.getMessage());
        }
    }
}
