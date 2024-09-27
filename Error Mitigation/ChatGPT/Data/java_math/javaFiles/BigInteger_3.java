import java.math.BigInteger;

public class BigInteger_3 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("123456789");
        BigInteger num2 = new BigInteger("987654321");
        
        BigInteger result = num1.multiply(num2);
        
        System.out.println("Result of multiplication: " + result);
    }
}
