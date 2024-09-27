import java.math.BigInteger;
import java.security.cert.X509CertSelector;

public class X509CertSelector_3 {
    public static void main(String[] args) {
        X509CertSelector certSelector = new X509CertSelector();
        BigInteger serialNumber = new BigInteger("1234567890");
        certSelector.setSerialNumber(serialNumber);
    }
}
