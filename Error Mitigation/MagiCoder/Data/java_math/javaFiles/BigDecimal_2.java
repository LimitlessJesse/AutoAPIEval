import java.math.BigDecimal;

public class BigDecimal_2 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("123.456");
        BigDecimal num2 = new BigDecimal("789.012");

        BigDecimal result = num1.add(num2);

        System.out.println("Result: " + result);
    }
}
