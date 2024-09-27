import java.math.BigInteger;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;

public class RSAMultiPrimePrivateCrtKeySpec_2 {
    public static void main(String[] args) {
        BigInteger primeP = new BigInteger("1234567890"); // Example value
        RSAMultiPrimePrivateCrtKeySpec keySpec = new RSAMultiPrimePrivateCrtKeySpec(
                primeP, null, null, null, null, null, null, null, null);
        
        BigInteger retrievedPrimeP = keySpec.getPrimeP();
        System.out.println("Retrieved primeP: " + retrievedPrimeP);
    }
}
