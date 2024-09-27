import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathChecker;
import java.security.cert.PKIXRevocationChecker;

public class CertPathBuilder_4 {
    public static void main(String[] args) {
        CertPathBuilder builder = CertPathBuilder.getInstance("PKIX");
        CertPathChecker revChecker = builder.getRevocationChecker();
        
        if (revChecker instanceof PKIXRevocationChecker) {
            PKIXRevocationChecker pkixRevChecker = (PKIXRevocationChecker) revChecker;
            System.out.println("Revocation checker obtained successfully: " + pkixRevChecker.toString());
        } else {
            System.out.println("Revocation checker obtained is not of type PKIXRevocationChecker");
        }
    }
}
