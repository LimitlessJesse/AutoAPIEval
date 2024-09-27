import java.math.BigInteger;

public class BigInteger_1 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("-12345");
        BigInteger absNum = num1.abs();
        System.out.println("Absolute value of " + num1 + " is: " + absNum);
    }
}
