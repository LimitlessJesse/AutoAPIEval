import java.util.Scanner;

public class Scanner_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double:");
        if (scanner.hasNextDouble()) {
            double input = scanner.nextDouble();
            System.out.println("You entered: " + input);
        } else {
            System.out.println("Invalid input. Please enter a double.");
        }
        scanner.close();
    }
}
