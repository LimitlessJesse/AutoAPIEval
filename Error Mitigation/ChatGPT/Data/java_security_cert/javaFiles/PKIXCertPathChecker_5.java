import java.security.cert.PKIXCertPathChecker;

public class PKIXCertPathChecker_5 {
    public static void main(String[] args) {
        PKIXCertPathChecker checker = new PKIXCertPathChecker() {
            @Override
            public Object clone() {
                return super.clone();
            }
        };
        
        Object clonedChecker = checker.clone();
        System.out.println("Cloned checker: " + clonedChecker);
    }
}
