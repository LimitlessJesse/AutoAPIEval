import java.util.Scanner;

public class Scanner_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a float:");
        float f = scanner.nextFloat();
        System.out.println("You entered: " + f);
        scanner.close();
    }
}
