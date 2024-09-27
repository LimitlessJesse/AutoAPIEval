import java.math.BigDecimal;

public class BigDecimal_1 {
    public static void main(String[] args) {
        BigDecimal augend = new BigDecimal("100");
        BigDecimal addend = new BigDecimal("200");
        BigDecimal result = augend.add(addend);
        System.out.println("The result is: " + result);
    }
}
