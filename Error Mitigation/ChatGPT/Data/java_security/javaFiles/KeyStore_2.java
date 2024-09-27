import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class KeyStore_2 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            FileInputStream fileInputStream = new FileInputStream("keystore.jks");
            char[] password = "password".toCharArray();
            keyStore.load(fileInputStream, password);
            System.out.println("KeyStore loaded successfully");
        } catch (IOException | NoSuchAlgorithmException | CertificateException e) {
            e.printStackTrace();
        }
    }
}
