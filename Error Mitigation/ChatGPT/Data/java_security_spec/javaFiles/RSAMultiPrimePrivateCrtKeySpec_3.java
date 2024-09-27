import java.math.BigInteger;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;

public class RSAMultiPrimePrivateCrtKeySpec_3 {
    public static void main(String[] args) {
        BigInteger primeQ = new BigInteger("1234567890"); // Example value
        RSAMultiPrimePrivateCrtKeySpec keySpec = new RSAMultiPrimePrivateCrtKeySpec(
                new BigInteger("modulus"), // Example modulus value
                new BigInteger("publicExponent"), // Example public exponent value
                new BigInteger("privateExponent"), // Example private exponent value
                new BigInteger("primeP"), // Example primeP value
                new BigInteger("primeQ"), // Example primeQ value
                new BigInteger("primeExponentP"), // Example primeExponentP value
                new BigInteger("primeExponentQ"), // Example primeExponentQ value
                new BigInteger("crtCoefficient"), // Example crtCoefficient value
                new BigInteger[]{new BigInteger("otherPrimeInfo1"), new BigInteger("otherPrimeInfo2")} // Example otherPrimeInfo values
        );
        
        BigInteger retrievedPrimeQ = keySpec.getPrimeQ();
        System.out.println("PrimeQ: " + retrievedPrimeQ);
    }
}
