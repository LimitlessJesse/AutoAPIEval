import java.security.cert.X509CertSelector;
import java.io.IOException;

public class X509CertSelector_2 {
    public static void main(String[] args) {
        X509CertSelector certSelector = new X509CertSelector();
        try {
            certSelector.setIssuer("CN=ExampleIssuer, O=ExampleOrg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
