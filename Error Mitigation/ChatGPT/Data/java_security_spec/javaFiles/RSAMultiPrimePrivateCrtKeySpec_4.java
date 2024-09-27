import java.math.BigInteger;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;

public class RSAMultiPrimePrivateCrtKeySpec_4 {
    public static void main(String[] args) {
        BigInteger primeExponentP = new BigInteger("1234567890"); // Example value
        RSAMultiPrimePrivateCrtKeySpec keySpec = new RSAMultiPrimePrivateCrtKeySpec(
                new BigInteger("modulus"), // Example modulus value
                new BigInteger("publicExponent"), // Example publicExponent value
                new BigInteger("privateExponent"), // Example privateExponent value
                new BigInteger("primeP"), // Example primeP value
                new BigInteger("primeQ"), // Example primeQ value
                new BigInteger("primeExponentP"), // Example primeExponentP value
                new BigInteger("primeExponentQ"), // Example primeExponentQ value
                new BigInteger("crtCoefficient"), // Example crtCoefficient value
                new BigInteger[]{new BigInteger("otherPrimeP"), new BigInteger("otherPrimeQ")}, // Example otherPrime values
                new BigInteger[]{new BigInteger("otherPrimeExponentP"), new BigInteger("otherPrimeExponentQ")}, // Example otherPrimeExponent values
                new BigInteger[]{new BigInteger("otherCrtCoefficient")}); // Example otherCrtCoefficient values

        BigInteger retrievedPrimeExponentP = keySpec.getPrimeExponentP();
        System.out.println("Retrieved primeExponentP: " + retrievedPrimeExponentP);
    }
}
