import java.math.BigInteger;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

public class RSAPrivateCrtKeySpec_3 {
    public static void main(String[] args) {
        RSAPrivateCrtKeySpec keySpec = new RSAPrivateCrtKeySpec(
            new BigInteger("1234567890"), // modulus
            new BigInteger("12345"), // publicExponent
            new BigInteger("54321"), // privateExponent
            new BigInteger("1234"), // primeP
            new BigInteger("5678"), // primeQ
            new BigInteger("4321"), // primeExponentP
            new BigInteger("8765"), // primeExponentQ
            new BigInteger("9876") // crtCoefficient
        );

        BigInteger primeQ = keySpec.getPrimeQ();
        System.out.println("PrimeQ: " + primeQ);
    }
}
