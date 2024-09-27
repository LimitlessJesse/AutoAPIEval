import java.math.BigDecimal;

public class BigDecimal_3 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("2.5");
        
        BigDecimal result = num1.multiply(num2);
        
        System.out.println("Result of multiplication: " + result);
    }
}
