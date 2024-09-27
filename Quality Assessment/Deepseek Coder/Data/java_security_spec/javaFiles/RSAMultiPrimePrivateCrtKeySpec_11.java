import java.math.BigInteger;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;

public class RSAMultiPrimePrivateCrtKeySpec_11 {
    public static void main(String[] args) {
        BigInteger p = new BigInteger("103");
        BigInteger q = new BigInteger("37");
        BigInteger dp = new BigInteger("7");
        BigInteger dq = new BigInteger("41");
        BigInteger iq = new BigInteger("24");
        BigInteger p1 = new BigInteger("1");
        BigInteger p2 = new BigInteger("0");
        BigInteger q1 = new BigInteger("1");
        BigInteger q2 = new BigInteger("0");
        BigInteger r = new BigInteger("11");
        BigInteger d = new BigInteger("67");

        RSAPrivateCrtKeySpec spec = new RSAPrivateCrtKeySpec(d, p, q, p1, p2, q1, q2, iq);
        RSAMultiPrimePrivateCrtKeySpec multiPrimeSpec = new RSAMultiPrimePrivateCrtKeySpec(spec, dp, dq, r);

        BigInteger primeExponentQ = multiPrimeSpec.getPrimeExponentQ();
        System.out.println("Prime Exponent Q: " + primeExponentQ);
    }
}
