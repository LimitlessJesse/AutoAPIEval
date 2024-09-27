import java.math.BigInteger;

public class BigInteger_5 {
    public static void main(String[] args) {
        BigInteger base = new BigInteger("2");
        int exponent = 10;
        
        BigInteger result = base.pow(exponent);
        
        System.out.println(result); // Output: 1024
    }
}
