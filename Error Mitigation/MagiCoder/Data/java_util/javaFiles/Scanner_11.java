import java.util.Scanner;
import java.math.BigDecimal;

public class Scanner_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a BigDecimal:");
        BigDecimal bigDecimal = scanner.nextBigDecimal();
        System.out.println("You entered: " + bigDecimal);
        scanner.close();
    }
}
