import java.util.Scanner;

public class Scanner_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a double number: ");
        double number = scanner.nextDouble();
        
        System.out.println("You entered: " + number);
        
        scanner.close();
    }
}
