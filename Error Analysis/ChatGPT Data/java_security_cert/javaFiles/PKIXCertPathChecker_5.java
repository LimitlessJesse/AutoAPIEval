import java.security.cert.PKIXCertPathChecker;
import java.util.Set;

public class PKIXCertPathChecker_5 {
    public static void main(String[] args) {
        PKIXCertPathChecker checker = null; // Initialize PKIXCertPathChecker object
        Set<String> extensions = checker.getSupportedExtensions();
        System.out.println(extensions);
    }
}
