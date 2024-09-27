import java.math.BigDecimal;

public class BigDecimal_3 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("123.45");
        BigDecimal bd2 = new BigDecimal("10");

        BigDecimal result = bd1.multiply(bd2);

        System.out.println("The result is: " + result);
    }
}
