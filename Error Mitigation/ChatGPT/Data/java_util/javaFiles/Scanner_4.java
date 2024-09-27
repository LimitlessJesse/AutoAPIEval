import java.util.Scanner;

public class Scanner_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String input = scanner.next();
        
        boolean hasNextToken = scanner.hasNext();
        System.out.println("Has next token: " + hasNextToken);
        
        scanner.close();
    }
}
