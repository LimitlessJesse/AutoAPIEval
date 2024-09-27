import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_5 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10");
        BigDecimal num2 = new BigDecimal("3");
        int scale = 2;
        int roundingMode = RoundingMode.HALF_UP.ordinal();

        BigDecimal result = num1.divide(num2, scale, roundingMode);
        System.out.println("Result: " + result);
    }
}
