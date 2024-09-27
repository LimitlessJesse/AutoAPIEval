import java.security.cert.X509CRLSelector;

public class X509CRLSelector_3 {
    public static void main(String[] args) {
        X509CRLSelector selector = new X509CRLSelector();
        String issuerName = "ExampleIssuer";
        selector.addIssuerName(issuerName);
    }
}
