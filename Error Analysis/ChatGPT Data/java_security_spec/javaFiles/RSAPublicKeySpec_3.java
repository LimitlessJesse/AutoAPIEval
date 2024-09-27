import java.math.BigInteger;
import java.security.spec.RSAPublicKeySpec;

public class RSAPublicKeySpec_3 {
    public static void main(String[] args) {
        // Assume publicKeySpec is initialized with RSAPublicKeySpec instance
        RSAPublicKeySpec publicKeySpec = new RSAPublicKeySpec(new BigInteger("123456789"), new BigInteger("65537"));
        
        BigInteger publicExponent = publicKeySpec.getPublicExponent();
        System.out.println("Public Exponent: " + publicExponent);
    }
}
