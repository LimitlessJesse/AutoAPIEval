import java.math.BigInteger;
import java.security.spec.RSAPrivateCrtKeySpec;

public class RSAPrivateCrtKeySpec_5 {
    public static void main(String[] args) {
        RSAPrivateCrtKeySpec rsaKeySpec = new RSAPrivateCrtKeySpec(
                new BigInteger("1234567890"),  // modulus
                new BigInteger("12345"),       // public exponent
                new BigInteger("987654321"),   // private exponent
                new BigInteger("13579"),       // primeP
                new BigInteger("24680"),       // primeQ
                new BigInteger("35791"),       // primeExponentP
                new BigInteger("46802"),       // primeExponentQ
                new BigInteger("57913")        // crtCoefficient
        );
        
        BigInteger primeExponentQ = rsaKeySpec.getPrimeExponentQ();
        System.out.println("Prime Exponent Q: " + primeExponentQ);
    }
}
