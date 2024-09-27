import java.math.BigInteger;

public class BigInteger_4 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("10");
        BigInteger num2 = new BigInteger("2");
        
        BigInteger result = num1.divide(num2);
        
        System.out.println("Result of division: " + result);
    }
}
