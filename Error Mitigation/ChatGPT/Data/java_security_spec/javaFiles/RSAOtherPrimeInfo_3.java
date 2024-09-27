import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;

public class RSAOtherPrimeInfo_3 {
    public static void main(String[] args) {
        BigInteger prime = new BigInteger("65537");
        BigInteger exponent = new BigInteger("17");
        BigInteger coefficient = new BigInteger("12345");
        
        RSAOtherPrimeInfo otherPrimeInfo = new RSAOtherPrimeInfo(prime, exponent, coefficient);
        
        BigInteger retrievedPrime = otherPrimeInfo.getPrime();
        System.out.println("Retrieved prime: " + retrievedPrime);
    }
}
