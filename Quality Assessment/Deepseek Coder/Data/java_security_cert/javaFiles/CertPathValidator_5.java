import java.security.cert.CertPathValidator;
import java.security.cert.CertPathChecker;
import java.security.cert.Certificate;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.CertificateFactory;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.CertStore;
import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CertPathValidator_5 {
    public static void main(String[] args) {
        try {
            // Create a CertificateFactory
            CertificateFactory cf = CertificateFactory.getInstance("X.509");

            // Create a Certificate
            Certificate cert = cf.generateCertificate(CertPathValidator_5.class.getResourceAsStream("/certificate.cer"));

            // Create a CertPath
            CertPath cp = cf.getCertPath(Collections.singletonList(cert));

            // Create a CertPathValidator
            CertPathValidator cpv = CertPathValidator.getInstance("PKIX");

            // Create a PKIXParameters
            PKIXParameters params = new PKIXParameters(Collections.singleton(new TrustAnchor(cert.getPublicKey(), null)));

            // Set the CertPathChecker
            params.setCertPathChecker(cpv.getRevocationChecker());

            // Validate the CertPath
            cpv.validate(cp, params);

            System.out.println("Certificate is valid");
        } catch (Exception e) {
            System.out.println("Certificate is not valid: " + e.getMessage());
        }
    }
}
