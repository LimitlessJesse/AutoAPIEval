import java.math.BigInteger;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;

public class RSAMultiPrimePrivateCrtKeySpec_5 {
    public static void main(String[] args) {
        RSAMultiPrimePrivateCrtKeySpec keySpec = new RSAMultiPrimePrivateCrtKeySpec(
                new BigInteger("modulus"),
                new BigInteger("publicExponent"),
                new BigInteger("privateExponent"),
                new BigInteger("primeP"),
                new BigInteger("primeQ"),
                new BigInteger("primeExponentP"),
                new BigInteger("primeExponentQ"),
                new BigInteger("crtCoefficient"),
                new BigInteger[]{new BigInteger("otherPrimeInfo1"), new BigInteger("otherPrimeInfo2")},
                new BigInteger[]{new BigInteger("otherPrimeExponent1"), new BigInteger("otherPrimeExponent2")},
                new BigInteger[]{new BigInteger("otherCrtCoefficient1"), new BigInteger("otherCrtCoefficient2")}
        );

        BigInteger primeExponentQ = keySpec.getPrimeExponentQ();
        System.out.println("Prime Exponent Q: " + primeExponentQ);
    }
}
