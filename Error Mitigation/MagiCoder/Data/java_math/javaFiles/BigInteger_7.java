import java.math.BigInteger;

public class BigInteger_7 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("10");
        int exponent = 2;
        BigInteger result = bigInteger.pow(exponent);
        System.out.println("Result: " + result);
    }
}
