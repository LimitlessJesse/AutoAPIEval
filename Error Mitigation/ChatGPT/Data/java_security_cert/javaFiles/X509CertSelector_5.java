import java.security.cert.X509CertSelector;

public class X509CertSelector_5 {
    public static void main(String[] args) {
        X509CertSelector certSelector = new X509CertSelector();
        boolean[] keyUsage = {true, false, true, false, false, true, true, false, true};
        certSelector.setKeyUsage(keyUsage);
    }
}
