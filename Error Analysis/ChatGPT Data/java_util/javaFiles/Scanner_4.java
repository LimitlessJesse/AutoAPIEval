import java.util.Scanner;

public class Scanner_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        boolean hasNext = scanner.hasNextInt();

        if(hasNext) {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } else {
            System.out.println("Please enter a valid integer.");
        }
        scanner.close();
    }
}
