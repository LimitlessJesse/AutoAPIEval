import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;

public class KeyStore_PrivateKeyEntry_3 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            keyStore.load(new java.io.FileInputStream("keystore.jks"), "password".toCharArray());
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry("alias", new KeyStore.PasswordProtection("password".toCharArray()));
            Certificate[] certificateChain = privateKeyEntry.getCertificateChain();
            for (Certificate certificate : certificateChain) {
                System.out.println(certificate);
            }
        } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | UnrecoverableKeyException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
