import java.security.cert.PKIXCertPathValidatorResult;

public class PKIXCertPathValidatorResult_4 {
    public static void main(String[] args) {
        PKIXCertPathValidatorResult result = new PKIXCertPathValidatorResult(null, null, null, null);
        String resultString = result.toString();
        System.out.println(resultString);
    }
}
