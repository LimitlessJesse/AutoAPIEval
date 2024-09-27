import java.util.Scanner;

public class Scanner_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        
        System.out.println("You entered: " + num);
        
        scanner.close();
    }
}
