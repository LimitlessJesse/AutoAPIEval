import java.math.BigInteger;
import java.security.cert.X509CRLSelector;

public class X509CRLSelector_5 {
    public static void main(String[] args) {
        X509CRLSelector crlSelector = new X509CRLSelector();
        BigInteger minCRLNumber = new BigInteger("100");
        crlSelector.setMinCRLNumber(minCRLNumber);
    }
}
