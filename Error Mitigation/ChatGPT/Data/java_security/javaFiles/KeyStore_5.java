import java.security.KeyStore;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

public class KeyStore_5 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            char[] password = "keystorePassword".toCharArray();
            keyStore.load(null, password);
            
            String alias = "myKeyAlias";
            Key key = keyStore.getKey(alias, password);
            
            if (key != null) {
                System.out.println("Key retrieved successfully: " + key);
            } else {
                System.out.println("Key with alias " + alias + " does not exist or is not a key-related entry.");
            }
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e) {
            e.printStackTrace();
        }
    }
}
