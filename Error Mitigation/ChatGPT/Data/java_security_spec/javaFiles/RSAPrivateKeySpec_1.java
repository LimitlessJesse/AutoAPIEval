import java.math.BigInteger;
import java.security.spec.RSAPrivateKeySpec;

public class RSAPrivateKeySpec_1 {
    public static void main(String[] args) {
        BigInteger modulus = new BigInteger("1234567890"); // Example modulus value
        RSAPrivateKeySpec privateKeySpec = new RSAPrivateKeySpec(modulus, BigInteger.ONE); // Example private key spec
        BigInteger retrievedModulus = privateKeySpec.getModulus();
        System.out.println("Retrieved Modulus: " + retrievedModulus);
    }
}
