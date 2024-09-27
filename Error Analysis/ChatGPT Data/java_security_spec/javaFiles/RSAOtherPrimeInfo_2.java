import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;

public class RSAOtherPrimeInfo_2 {
    public static void main(String[] args) {
        RSAOtherPrimeInfo primeInfo = new RSAOtherPrimeInfo(BigInteger.valueOf(65537), BigInteger.valueOf(17), BigInteger.valueOf(257));
        int exponent = primeInfo.getExponent().intValue();
        System.out.println("Exponent: " + exponent);
    }
}
