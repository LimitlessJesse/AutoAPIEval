import java.math.BigInteger;

public class BigInteger_6 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("3");
        BigInteger result = a.remainder(b);
        System.out.println("The remainder of " + a + " divided by " + b + " is " + result);
    }
}
