import java.io.InputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.CertPath;
import java.security.cert.CertificateException;
import java.util.List;

public class CertificateFactory_5 {
    public static void main(String[] args) {
        try {
            // Create an InputStream (inStream) with the certificate content
            InputStream inStream = Main.class.getResourceAsStream("certificate.crt");

            // Create a CertificateFactory instance
            CertificateFactory factory = CertificateFactory.getInstance("X.509");

            // Generate a CertPath from the InputStream
            CertPath certPath = factory.generateCertPath(inStream);

            // Print out the CertPath
            List<? extends java.security.cert.Certificate> certificates = certPath.getCertificates();
            for (java.security.cert.Certificate cert : certificates) {
                System.out.println(cert);
            }

        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}
