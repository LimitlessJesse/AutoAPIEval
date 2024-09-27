import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class KeyStore_3 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null); // Initialize the keystore

            // Create an output stream to write the keystore
            OutputStream outputStream = new FileOutputStream("keystore.jks");

            // Generate a password for keystore integrity check
            char[] password = "password123".toCharArray();

            // Store the keystore with the provided password
            keyStore.store(outputStream, password);

            System.out.println("Keystore stored successfully.");

        } catch (KeyStoreException | IOException | NoSuchAlgorithmException | CertificateException e) {
            e.printStackTrace();
        }
    }
}
