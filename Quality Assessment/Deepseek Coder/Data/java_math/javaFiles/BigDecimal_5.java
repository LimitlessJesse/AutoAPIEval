import java.math.BigDecimal;

public class BigDecimal_5 {
    public static void main(String[] args) {
        BigDecimal dividend = new BigDecimal("10");
        BigDecimal divisor = new BigDecimal("3");
        BigDecimal remainder = dividend.remainder(divisor);
        System.out.println("The remainder is: " + remainder);
    }
}
