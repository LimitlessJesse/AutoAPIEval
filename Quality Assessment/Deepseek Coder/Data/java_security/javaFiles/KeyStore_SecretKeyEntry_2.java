import java.security.KeyStore;
import javax.crypto.SecretKey;

public class KeyStore_SecretKeyEntry_2 {
    public static void main(String[] args) throws Exception {
        // Create a KeyStore instance
        KeyStore keyStore = KeyStore.getInstance("JCEKS");
        keyStore.load(null, null);

        // Generate a SecretKey
        SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();

        // Store the SecretKey in the KeyStore
        KeyStore.SecretKeyEntry secretKeyEntry = new KeyStore.SecretKeyEntry(secretKey);
        keyStore.setEntry("myKey", secretKeyEntry, null);

        // Retrieve the SecretKey from the KeyStore
        KeyStore.Entry entry = keyStore.getEntry("myKey");
        if (entry instanceof KeyStore.SecretKeyEntry) {
            SecretKeyEntry secretKeyEntry = (SecretKeyEntry) entry;
            SecretKey retrievedSecretKey = secretKeyEntry.getSecretKey();
            System.out.println("Retrieved SecretKey: " + retrievedSecretKey);
        }
    }
}
