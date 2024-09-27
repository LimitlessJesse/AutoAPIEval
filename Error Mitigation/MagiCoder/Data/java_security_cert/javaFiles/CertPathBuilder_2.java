import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathParameters;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.List;

public class CertPathBuilder_2 {
    public static void main(String[] args) throws Exception {
        // Create a CertificateFactory
        CertificateFactory cf = CertificateFactory.getInstance("X.509");

        // Create a Certificate
        Certificate cert = cf.generateCertificate(CertPathBuilder_2.class.getResourceAsStream("/certificate.cer"));

        // Create a TrustAnchor
        TrustAnchor ta = new TrustAnchor(cert, null);

        // Create a PKIXBuilderParameters
        PKIXBuilderParameters pkixParams = new PKIXBuilderParameters(new TrustAnchor[0], null);

        // Create a CertPathBuilder
        CertPathBuilder builder = CertPathBuilder.getInstance("PKIX");

        // Create a CertPathParameters
        CertPathParameters params = pkixParams;

        // Build the CertPathBuilderResult
        CertPathBuilderResult result = builder.build(params);

        // Get the CertPath
        java.security.cert.CertPath certPath = result.getCertPath();

        // Get the PKIXCertPathValidatorResult
        PKIXCertPathValidatorResult validatorResult = (PKIXCertPathValidatorResult) result.getValidatorResult();

        // Get the CertPathCheckerResults
        List<CertPathChecker.Failure> failures = validatorResult.getCertPathCheckerResults();

        // Print the CertPath and the CertPathCheckerResults
        System.out.println("CertPath: " + certPath);
        System.out.println("CertPathCheckerResults: " + failures);
    }
}
