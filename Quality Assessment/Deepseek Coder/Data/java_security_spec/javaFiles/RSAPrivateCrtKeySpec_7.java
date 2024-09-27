import java.math.BigInteger;
import java.security.spec.RSAPrivateCrtKeySpec;

public class RSAPrivateCrtKeySpec_7 {
    public static void main(String[] args) {
        BigInteger p = new BigInteger("103");
        BigInteger q = new BigInteger("7");
        BigInteger dp = new BigInteger("7");
        BigInteger dq = new BigInteger("5");
        BigInteger iq = new BigInteger("3");
        BigInteger p1 = new BigInteger("2");
        BigInteger p2 = new BigInteger("3");
        BigInteger q1 = new BigInteger("2");
        BigInteger q2 = new BigInteger("3");

        RSAPrivateCrtKeySpec spec = new RSAPrivateCrtKeySpec(p, q, dp, dq, iq, p1, p2, q1, q2);

        BigInteger primeExponentQ = spec.getPrimeExponentQ();

        System.out.println("Prime Exponent Q: " + primeExponentQ);
    }
}
