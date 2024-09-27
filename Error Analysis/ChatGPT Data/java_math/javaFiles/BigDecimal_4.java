import java.math.BigDecimal;

public class BigDecimal_4 {
    public static void main(String[] args) {
        BigDecimal dividend = new BigDecimal("10");
        BigDecimal divisor = new BigDecimal("3");
        int scale = 2;
        BigDecimal result = dividend.divide(divisor, scale, BigDecimal.ROUND_HALF_UP);
        
        System.out.println("Result of division: " + result);
    }
}
