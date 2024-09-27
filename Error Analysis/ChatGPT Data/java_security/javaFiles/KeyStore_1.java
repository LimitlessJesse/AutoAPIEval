import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;

public class KeyStore_1 {
    public static void main(String[] args) {
        try {
            // Create a KeyStore object
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());

            // Load the KeyStore from an InputStream with a password
            char[] password = "mypassword".toCharArray();
            InputStream keystoreStream = new FileInputStream("mykeystore.jks");
            keyStore.load(keystoreStream, password);

            System.out.println("KeyStore loaded successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
