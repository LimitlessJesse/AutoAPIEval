import java.util.Scanner;

public class Scanner_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();
        System.out.println("You entered: " + line);
        scanner.close();
    }
}
