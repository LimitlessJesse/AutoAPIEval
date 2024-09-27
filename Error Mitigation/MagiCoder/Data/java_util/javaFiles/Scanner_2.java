import java.util.Scanner;

public class Scanner_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line:");
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("You entered: " + line);
        } else {
            System.out.println("No line found");
        }
        scanner.close();
    }
}
