import java.math.BigDecimal;

public class BigDecimal_1 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("20.75");
        
        BigDecimal result = num1.add(num2);
        
        System.out.println("Result of addition: " + result);
    }
}
