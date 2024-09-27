import java.util.Scanner;

public class Scanner_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a long number:");
        long longNumber = scanner.nextLong();
        System.out.println("You entered: " + longNumber);
        scanner.close();
    }
}
