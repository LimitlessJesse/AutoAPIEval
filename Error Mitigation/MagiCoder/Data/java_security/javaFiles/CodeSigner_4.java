import java.security.CodeSigner;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Date;

public class CodeSigner_4 {
    public static void main(String[] args) throws CertificateException {
        // Create two CodeSigner objects
        CodeSigner signer1 = new CodeSigner(getCertificate("cert1.der"), "timestamp1");
        CodeSigner signer2 = new CodeSigner(getCertificate("cert2.der"), "timestamp2");

        // Test for equality
        boolean areEqual = signer1.equals(signer2);
        System.out.println("Are the signers equal? " + areEqual);
    }

    // Helper method to get a certificate from a.der file
    private static X509Certificate getCertificate(String filename) throws CertificateException {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        return (X509Certificate) cf.generateCertificate(CodeSigner_4.class.getResourceAsStream(filename));
    }
}
