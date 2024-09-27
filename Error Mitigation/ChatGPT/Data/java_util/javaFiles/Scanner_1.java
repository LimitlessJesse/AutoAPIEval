import java.util.Scanner;
import java.util.NoSuchElementException;

public class Scanner_1 {
    public static void main(String[] args) {
        String input = "Hello World";
        Scanner scanner = new Scanner(input);
        
        String token = scanner.next();
        System.out.println(token);
        
        scanner.close();
    }
}
