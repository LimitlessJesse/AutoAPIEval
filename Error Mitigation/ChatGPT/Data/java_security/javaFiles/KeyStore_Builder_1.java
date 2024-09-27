import java.security.KeyStore;
import java.security.KeyStoreException;

public class KeyStore_Builder_1 {
    public static void main(String[] args) {
        try {
            KeyStore.Builder builder = KeyStore.Builder.newInstance("JKS", null, null);
            KeyStore keyStore = builder.getKeyStore();
            System.out.println("KeyStore type: " + keyStore.getType());
        } catch (KeyStoreException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
