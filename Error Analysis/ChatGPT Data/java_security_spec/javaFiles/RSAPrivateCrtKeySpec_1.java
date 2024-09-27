import java.math.BigInteger;
import java.security.spec.RSAPrivateCrtKeySpec;

public class RSAPrivateCrtKeySpec_1 {
    public static void main(String[] args) {
        RSAPrivateCrtKeySpec keySpec = new RSAPrivateCrtKeySpec(
                new BigInteger("1234567890"),
                new BigInteger("1234567890"),
                new BigInteger("1234567890"),
                new BigInteger("1234567890"),
                new BigInteger("1234567890"),
                new BigInteger("1234567890"),
                new BigInteger("1234567890"),
                new BigInteger("1234567890")
        );

        BigInteger publicExponent = keySpec.getPublicExponent();
        System.out.println("Public Exponent: " + publicExponent);
    }
}
