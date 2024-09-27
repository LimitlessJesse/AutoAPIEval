import java.security.KeyStore;
import java.security.PrivateKey;

public class KeyStore_PrivateKeyEntry_2 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            char[] password = "password".toCharArray();
            keyStore.load(null, password);
            
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry("alias", new KeyStore.PasswordProtection(password));
            PrivateKey privateKey = privateKeyEntry.getPrivateKey();
            
            System.out.println("Private Key: " + privateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
