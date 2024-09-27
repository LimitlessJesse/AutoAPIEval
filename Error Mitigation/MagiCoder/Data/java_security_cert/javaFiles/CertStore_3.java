import java.security.cert.CertStore;
import java.security.cert.CertStoreParameters;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidAlgorithmParameterException;

public class CertStore_3 {
    public static void main(String[] args) {
        try {
            CertStoreParameters params = null; // Replace with your parameters
            CertStore certStore = CertStore.getInstance("Collection", params);
            System.out.println(certStore);
        } catch (NoSuchAlgorithmException | InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
    }
}
