import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.cert.CertificateEncodingException;

public class Certificate_2 {
    public static void main(String[] args) {
        try {
            // Create a new X509Certificate
            Certificate cert = new X509Certificate() {
                // This is a dummy implementation, you should replace it with your actual certificate
            };

            // Get the encoded form of the certificate
            byte[] encodedCert = cert.getEncoded();

            // Print the encoded form
            for (byte b : encodedCert) {
                System.out.printf("%02X ", b);
            }
            System.out.println();
        } catch (CertificateEncodingException e) {
            System.out.println("Error encoding certificate: " + e.getMessage());
        }
    }
}
