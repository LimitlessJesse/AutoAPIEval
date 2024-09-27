import java.util.Scanner;

public class Scanner_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
