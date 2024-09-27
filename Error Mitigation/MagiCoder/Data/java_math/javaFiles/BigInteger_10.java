import java.math.BigInteger;

public class BigInteger_10 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("20");
        BigInteger gcd = a.gcd(b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
}
