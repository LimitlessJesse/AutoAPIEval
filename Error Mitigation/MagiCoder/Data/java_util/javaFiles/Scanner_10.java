import java.util.Scanner;
import java.math.BigInteger;

public class Scanner_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a BigInteger:");
        BigInteger bigInteger = scanner.nextBigInteger();
        System.out.println("You entered: " + bigInteger);
        scanner.close();
    }
}
