import java.math.BigInteger;
import java.security.spec.RSAPrivateCrtKeySpec;

public class RSAPrivateCrtKeySpec_5 {
    public static void main(String[] args) {
        RSAPrivateCrtKeySpec keySpec = new RSAPrivateCrtKeySpec(
            new BigInteger("modulus"),
            new BigInteger("publicExponent"),
            new BigInteger("privateExponent"),
            new BigInteger("primeP"),
            new BigInteger("primeQ"),
            new BigInteger("primeExponentP"),
            new BigInteger("primeExponentQ"),
            new BigInteger("crtCoefficient")
        );
        
        BigInteger primeQ = keySpec.getPrimeQ();
        System.out.println("PrimeQ: " + primeQ);
    }
}
