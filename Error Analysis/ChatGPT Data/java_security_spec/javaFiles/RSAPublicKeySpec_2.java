import java.math.BigInteger;
import java.security.spec.RSAPublicKeySpec;

public class RSAPublicKeySpec_2 {
    public static void main(String[] args) {
        // Create an example RSAPublicKeySpec
        BigInteger modulus = new BigInteger("1234567890");
        RSAPublicKeySpec rsaPublicKeySpec = new RSAPublicKeySpec(modulus, BigInteger.ONE);
        
        // Get the modulus using getModulus()
        BigInteger retrievedModulus = rsaPublicKeySpec.getModulus();
        
        // Print the retrieved modulus
        System.out.println("Retrieved Modulus: " + retrievedModulus);
    }
}
