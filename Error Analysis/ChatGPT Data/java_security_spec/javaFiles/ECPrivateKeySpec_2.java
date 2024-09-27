import java.math.BigInteger;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.ECPoint;

public class ECPrivateKeySpec_2 {
    public static void main(String[] args) {
        BigInteger s = new BigInteger("1234567890"); // Sample BigInteger value
        ECPoint w = new ECPoint(BigInteger.ONE, BigInteger.TWO); // Sample ECPoint
        EllipticCurve curve = new EllipticCurve(new ECFieldFp(BigInteger.TEN), BigInteger.ONE, BigInteger.TWO);
        ECPrivateKeySpec privateKeySpec = new ECPrivateKeySpec(s, curve, w);
        
        BigInteger retrievedS = privateKeySpec.getS();
        System.out.println("Retrieved S value: " + retrievedS);
    }
}
