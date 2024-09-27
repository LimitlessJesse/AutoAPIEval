import java.security.cert.PKIXCertPathChecker;

public class PKIXCertPathChecker_2 {
    public static void main(String[] args) {
        PKIXCertPathChecker checker = new PKIXCertPathChecker() {
            @Override
            public boolean isForwardCheckingSupported() {
                return true; // Implement your logic here
            }
        };
        
        System.out.println("Forward checking supported: " + checker.isForwardCheckingSupported());
    }
}
