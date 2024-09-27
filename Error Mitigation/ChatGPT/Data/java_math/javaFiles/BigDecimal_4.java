import java.math.BigDecimal;

public class BigDecimal_4 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10");
        BigDecimal num2 = new BigDecimal("3");
        
        BigDecimal result = num1.divide(num2);
        
        System.out.println("Result of division: " + result);
    }
}
