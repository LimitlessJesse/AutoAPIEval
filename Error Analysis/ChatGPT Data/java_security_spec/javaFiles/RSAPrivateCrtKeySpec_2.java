import java.math.BigInteger;
import java.security.spec.RSAPrivateCrtKeySpec;

public class RSAPrivateCrtKeySpec_2 {
    public static void main(String[] args) {
        RSAPrivateCrtKeySpec privateKeySpec = new RSAPrivateCrtKeySpec(
                new BigInteger("1234567890"), // modulus
                new BigInteger("12345"),       // public exponent
                new BigInteger("123456"),      // private exponent
                new BigInteger("54321"),       // primeP
                new BigInteger("98765"),       // primeQ
                new BigInteger("54321"),       // primeExponentP
                new BigInteger("98765"),       // primeExponentQ
                new BigInteger("1234567890")   // crtCoefficient
        );

        BigInteger primeP = privateKeySpec.getPrimeP();
        System.out.println("PrimeP: " + primeP);
    }
}
