import java.security.KeyStore;
import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import java.security.NoSuchAlgorithmException;

public class KeyStore_SecretKeyEntry_5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyStore keyStore = KeyStore.getInstance("JCEKS");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        KeyStore.SecretKeyEntry secretKeyEntry = new KeyStore.SecretKeyEntry(secretKey);
        System.out.println(secretKeyEntry.toString());
    }
}
