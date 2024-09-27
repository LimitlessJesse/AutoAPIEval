import java.math.BigInteger;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;

public class RSAMultiPrimePrivateCrtKeySpec_8 {
    public static void main(String[] args) {
        BigInteger modulus = new BigInteger("10007");
        BigInteger publicExponent = new BigInteger("65537");
        BigInteger privateExponent = new BigInteger("61207");
        BigInteger[] primeP = {new BigInteger("10001"), new BigInteger("100003")};
        BigInteger[] primeQ = {new BigInteger("100009"), new BigInteger("100003")};
        BigInteger[] exponentP = {new BigInteger("1"), new BigInteger("6")};
        BigInteger[] exponentQ = {new BigInteger("1"), new BigInteger("2")};
        BigInteger crtCoefficient = new BigInteger("100000");

        RSAMultiPrimePrivateCrtKeySpec spec = new RSAMultiPrimePrivateCrtKeySpec(modulus, publicExponent, privateExponent, primeP, primeQ, exponentP, exponentQ, crtCoefficient);

        BigInteger primePValue = spec.getPrimeP();
        System.out.println("Prime P: " + primePValue);
    }
}
