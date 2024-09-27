import java.math.BigDecimal;

public class BigDecimal_5 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("20.5");

        int result = num1.compareTo(num2);

        if (result < 0) {
            System.out.println(num1 + " is less than " + num2);
        } else if (result == 0) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num1 + " is greater than " + num2);
        }
    }
}
