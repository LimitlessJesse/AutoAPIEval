import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;

public class RSAOtherPrimeInfo_3 {
    public static void main(String[] args) {
        RSAOtherPrimeInfo otherPrimeInfo = new RSAOtherPrimeInfo(BigInteger.valueOf(11), BigInteger.valueOf(13), BigInteger.valueOf(17));
        System.out.println("Other Prime Info: " + otherPrimeInfo);
    }
}
