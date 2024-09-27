import javax.crypto.spec.DHParameterSpec;
import java.math.BigInteger;

public class DHParameterSpec_1 {
    public static void main(String[] args) {
        // Create DH parameters
        BigInteger p = new BigInteger("1234567890");
        BigInteger g = new BigInteger("2");
        int l = 512;
        DHParameterSpec dhParams = new DHParameterSpec(p, g, l);
        
        // Get the prime modulus 'p' from DH parameters
        BigInteger primeModulus = dhParams.getP();
        
        System.out.println("Prime Modulus (p): " + primeModulus);
    }
}
