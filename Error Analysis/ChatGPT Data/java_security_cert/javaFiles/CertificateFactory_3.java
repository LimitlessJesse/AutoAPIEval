import java.io.FileInputStream;
import java.io.InputStream;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;

public class CertificateFactory_3 {
    public static void main(String[] args) {
        try {
            InputStream inStream = new FileInputStream("example.crl");
            X509CRL crl = generateCRL(inStream);
            System.out.println(crl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static X509CRL generateCRL(InputStream inStream) throws CRLException {
        try {
            CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
            return (X509CRL) certFactory.generateCRL(inStream);
        } catch (Exception e) {
            throw new CRLException("Error generating CRL: " + e.getMessage());
        }
    }
}
