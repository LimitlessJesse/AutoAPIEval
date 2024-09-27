import java.util.Scanner;

public class Scanner_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a double value:");
        double value = scanner.nextDouble();
        
        System.out.println("Double value entered: " + value);
    }
}
