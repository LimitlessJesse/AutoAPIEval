import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;

public class RSAOtherPrimeInfo_2 {
    public static void main(String[] args) {
        RSAOtherPrimeInfo rsaOtherPrimeInfo = new RSAOtherPrimeInfo(BigInteger.valueOf(17), BigInteger.valueOf(3), BigInteger.valueOf(5));
        BigInteger primeExponent = rsaOtherPrimeInfo.getExponent();
        System.out.println("Prime Exponent: " + primeExponent);
    }
}
