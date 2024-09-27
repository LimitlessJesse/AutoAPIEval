import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;

public class RSAOtherPrimeInfo_3 {
    public static void main(String[] args) {
        // Create a new RSAOtherPrimeInfo object
        RSAOtherPrimeInfo rsaOtherPrimeInfo = new RSAOtherPrimeInfo(new BigInteger("1234567890"), new BigInteger("11"), new BigInteger("13"));

        // Get the prime
        BigInteger prime = rsaOtherPrimeInfo.getPrime();

        // Print the prime
        System.out.println("Prime: " + prime);
    }
}
