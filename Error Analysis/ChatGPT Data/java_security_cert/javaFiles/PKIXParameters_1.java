import java.security.cert.PKIXParameters;
import java.security.KeyStore;
import java.security.cert.CertStore;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.security.cert.TrustAnchor;

public class PKIXParameters_1 {
    public static void main(String[] args) throws Exception {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, "password".toCharArray());

        CertStore certStore = CertStore.getInstance("Collection", new CollectionCertStoreParameters(new ArrayList<>()));

        PKIXParameters params = new PKIXParameters(keyStore);
        params.setRevocationEnabled(true);

        System.out.println("Revocation enabled: " + params.isRevocationEnabled());
    }
}
