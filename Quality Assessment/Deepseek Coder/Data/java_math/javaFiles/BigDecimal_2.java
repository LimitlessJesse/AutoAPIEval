import java.math.BigDecimal;

public class BigDecimal_2 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("100.50");
        BigDecimal bd2 = new BigDecimal("50.25");
        BigDecimal result = bd1.subtract(bd2);
        System.out.println("The result is: " + result);
    }
}
