import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathParameters;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.security.cert.CertPathChecker;
import java.security.cert.CertPathValidatorException;

public class CertPathBuilder_1 {
    public static void main(String[] args) throws Exception {
        // Load the certificate
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        InputStream in = new FileInputStream("path_to_your_certificate.cer");
        Certificate cert = cf.generateCertificate(in);
        in.close();

        // Create a trust anchor
        TrustAnchor ta = new TrustAnchor(cert.getPublicKey(), null);

        // Create a PKIX builder parameters
        PKIXBuilderParameters pbParams = new PKIXBuilderParameters(new HashSet<TrustAnchor>(Arrays.asList(ta)));

        // Create a CertPathBuilder
        CertPathBuilder builder = CertPathBuilder.getInstance("PKIX");

        // Build the CertPath
        CertPath certPath = builder.build(pbParams);

        // Print the CertPath
        System.out.println(certPath);
    }
}
