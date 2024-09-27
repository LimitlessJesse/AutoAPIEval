import java.math.BigInteger;

public class BigInteger_10 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("100");
        BigInteger num2 = new BigInteger("50");

        BigInteger gcd = num1.gcd(num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
