import java.math.BigDecimal;

public class BigDecimal_2 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("5.2");

        BigDecimal result = num1.subtract(num2);
        System.out.println(result); // Output: 5.3
    }
}
