import javax.crypto.spec.DHPublicKeySpec;
import java.math.BigInteger;

public class DHPublicKeySpec_2 {
    public static void main(String[] args) {
        // Create a DHPublicKeySpec object
        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(new BigInteger("1234567890"), new BigInteger("9876543210"), new BigInteger("12345"));

        // Get the prime modulus p using getP() method
        BigInteger primeModulus = dhPublicKeySpec.getP();

        // Print the prime modulus p
        System.out.println("Prime modulus p: " + primeModulus);
    }
}
