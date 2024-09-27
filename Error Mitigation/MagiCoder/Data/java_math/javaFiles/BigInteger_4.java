import java.math.BigInteger;

public class BigInteger_4 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("98765432109876543210");
        BigInteger result = num1.multiply(num2);
        System.out.println("Result: " + result);
    }
}
