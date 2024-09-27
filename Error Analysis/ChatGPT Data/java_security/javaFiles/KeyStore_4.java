import java.security.KeyStore;
import java.security.cert.Certificate;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class KeyStore_4 {
    public static void main(String[] args) {
        try {
            KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
            char[] password = "keystorePassword".toCharArray();
            try (FileInputStream fis = new FileInputStream("keystorePath")) {
                keystore.load(fis, password);
            }

            String alias = "certificateAlias";
            Certificate cert = keystore.getCertificate(alias);
            System.out.println("Certificate obtained: " + cert.toString());
        } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | IOException e) {
            e.printStackTrace();
        }
    }
}
