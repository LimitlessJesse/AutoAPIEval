import java.security.cert.X509CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Date;

public class X509CRL_3 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            X509CRL crl = (X509CRL) cf.generateCRL(new java.io.FileInputStream("path_to_your_crl.crl"));
            Date thisUpdate = crl.getThisUpdate();
            System.out.println("This CRL was last updated on: " + thisUpdate);
        } catch (CertificateException | CRLException e) {
            e.printStackTrace();
        }
    }
}
