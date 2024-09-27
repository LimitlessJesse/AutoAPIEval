import java.security.cert.PKIXCertPathValidatorResult;

public class PKIXCertPathValidatorResult_5 {
    public static void main(String[] args) {
        PKIXCertPathValidatorResult result = new PKIXCertPathValidatorResult() {
            @Override
            public Object clone() {
                try {
                    return super.clone();
                } catch (CloneNotSupportedException e) {
                    throw new InternalError(e.toString());
                }
            }
        };
        
        PKIXCertPathValidatorResult clonedResult = (PKIXCertPathValidatorResult) result.clone();
        System.out.println("Original result: " + result);
        System.out.println("Cloned result: " + clonedResult);
    }
}
