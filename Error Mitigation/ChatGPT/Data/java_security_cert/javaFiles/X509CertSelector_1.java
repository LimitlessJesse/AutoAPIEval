import java.security.cert.X509CertSelector;
import java.io.IOException;

public class X509CertSelector_1 {
    public static void main(String[] args) {
        X509CertSelector certSelector = new X509CertSelector();
        try {
            certSelector.setSubject("CN=John Doe, O=Example Org, C=US");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
