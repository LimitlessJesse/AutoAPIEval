import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;

public class CollectionCertStoreParameters_20 {
    public static void main(String[] args) {
        List<Certificate> certificates = new ArrayList<>();
        // Add certificates to the list
        CollectionCertStoreParameters params = new CollectionCertStoreParameters(certificates);
        System.out.println(params.toString());
    }
}
