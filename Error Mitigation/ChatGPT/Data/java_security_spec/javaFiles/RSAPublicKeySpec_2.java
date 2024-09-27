import java.math.BigInteger;
import java.security.spec.RSAPublicKeySpec;

public class RSAPublicKeySpec_2 {
    public static void main(String[] args) {
        RSAPublicKeySpec keySpec = new RSAPublicKeySpec(new BigInteger("1234567890"), new BigInteger("65537"));
        BigInteger publicExponent = keySpec.getPublicExponent();
        System.out.println("Public Exponent: " + publicExponent);
    }
}
