import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;
import java.security.spec.RSAPrimeInfo;

public class RSAOtherPrimeInfo_2 {
    public static void main(String[] args) {
        // Create a RSAOtherPrimeInfo object
        RSAOtherPrimeInfo rsaOtherPrimeInfo = new RSAOtherPrimeInfo(
                BigInteger.valueOf(61), // prime
                BigInteger.valueOf(5), // primeExponent
                BigInteger.valueOf(60), // crtCoefficient
                BigInteger.valueOf(58) // exponent
        );

        // Get the exponent
        BigInteger exponent = rsaOtherPrimeInfo.getExponent();

        // Print the exponent
        System.out.println("Exponent: " + exponent);
    }
}
