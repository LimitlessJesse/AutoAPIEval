import java.math.BigInteger;
import java.security.spec.RSAPrivateKeySpec;

public class RSAPrivateKeySpec_2 {
    public static void main(String[] args) {
        BigInteger modulus = new BigInteger("1234567890");
        BigInteger privateExponent = new BigInteger("9876543210");
        
        RSAPrivateKeySpec privateKeySpec = new RSAPrivateKeySpec(modulus, privateExponent);
        
        BigInteger retrievedPrivateExponent = privateKeySpec.getPrivateExponent();
        
        System.out.println("Private Exponent: " + retrievedPrivateExponent);
    }
}
