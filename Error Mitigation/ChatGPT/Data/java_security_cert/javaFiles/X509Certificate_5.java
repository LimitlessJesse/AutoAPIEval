import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;

public class X509Certificate_5 {
    public static void main(String[] args) {
        try {
            X509Certificate certificate = null; // Initialize X509Certificate object
            Date date = new Date(); // Current date/time
            certificate.checkValidity(date);
            System.out.println("Certificate is valid at the given date/time.");
        } catch (CertificateExpiredException e) {
            System.out.println("Certificate has expired.");
        } catch (CertificateNotYetValidException e) {
            System.out.println("Certificate is not yet valid.");
        }
    }
}
