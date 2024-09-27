import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;

public class CertificateFactory_1 {
    public static void main(String[] args) {
        try {
            byte[] certBytes = { /* Certificate bytes here */ };
            InputStream inStream = new ByteArrayInputStream(certBytes);
            
            CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
            Certificate cert = certFactory.generateCertificate(inStream);
            
            System.out.println("Generated Certificate: " + cert.toString());
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}
