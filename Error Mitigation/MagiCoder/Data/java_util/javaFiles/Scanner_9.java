import java.util.Scanner;

public class Scanner_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a boolean value:");
        boolean bool = scanner.nextBoolean();
        System.out.println("You entered: " + bool);
        scanner.close();
    }
}
