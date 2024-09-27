import java.security.KeyStore;
import java.security.KeyStore.SecretKeyEntry;
import javax.crypto.SecretKey;

public class KeyStore_SecretKeyEntry_1 {
    public static void main(String[] args) {
        KeyStore keyStore = KeyStore.getInstance("JKS");
        // Load the keystore
        keyStore.load(null, null);
        
        // Get the SecretKeyEntry from the keystore
        SecretKeyEntry secretKeyEntry = (SecretKeyEntry) keyStore.getEntry("alias", null);
        
        // Get the SecretKey from the SecretKeyEntry
        SecretKey secretKey = secretKeyEntry.getSecretKey();
        
        System.out.println("SecretKey algorithm: " + secretKey.getAlgorithm());
    }
}
