import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;
import java.security.spec.RSAPrimeInfo;

public class RSAOtherPrimeInfo_9 {
    public static void main(String[] args) {
        // Create a RSAOtherPrimeInfo object
        RSAPrimeInfo primeInfo = new RSAOtherPrimeInfo(BigInteger.valueOf(3), BigInteger.valueOf(5), BigInteger.valueOf(7));

        // Get the CRT coefficient
        BigInteger crtCoefficient = primeInfo.getCrtCoefficient();

        // Print the CRT coefficient
        System.out.println("CRT Coefficient: " + crtCoefficient);
    }
}
