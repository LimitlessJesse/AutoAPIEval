import java.security.cert.X509CertSelector;
import java.util.Date;

public class X509CertSelector_4 {
    public static void main(String[] args) {
        X509CertSelector certSelector = new X509CertSelector();
        Date date = new Date();
        certSelector.setCertificateValid(date);
    }
}
