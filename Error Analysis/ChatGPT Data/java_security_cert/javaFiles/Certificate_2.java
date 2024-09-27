import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class Certificate_2 {
    public static void main(String[] args) {
        try {
            // Assume cert is an X509Certificate object
            X509Certificate cert = (X509Certificate) certificate;

            byte[] encodedCert = cert.getEncoded();

            System.out.println("Encoded Certificate: " + new String(encodedCert));
        } catch (CertificateEncodingException e) {
            System.err.println("Error encoding certificate: " + e.getMessage());
        }
    }
}
