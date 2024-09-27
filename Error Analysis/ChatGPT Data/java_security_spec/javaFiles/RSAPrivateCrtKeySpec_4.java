import java.math.BigInteger;
import java.security.spec.RSAPrivateCrtKeySpec;

public class RSAPrivateCrtKeySpec_4 {
    public static void main(String[] args) {
        RSAPrivateCrtKeySpec keySpec = new RSAPrivateCrtKeySpec(BigInteger.valueOf(5), BigInteger.valueOf(3), BigInteger.valueOf(7), BigInteger.valueOf(11), BigInteger.valueOf(13), BigInteger.valueOf(17), BigInteger.valueOf(19), BigInteger.valueOf(23));
        
        BigInteger primeExponentP = keySpec.getPrimeExponentP();
        System.out.println("Prime Exponent P: " + primeExponentP);
    }
}
