import java.util.Scanner;

public class Scanner_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        
        if (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println("You entered: " + input);
        } else {
            System.out.println("No input found.");
        }
        
        scanner.close();
    }
}
