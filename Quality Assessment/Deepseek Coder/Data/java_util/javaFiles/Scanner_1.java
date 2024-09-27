import java.util.Scanner;

public class Scanner_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("Read: " + line);
        }
        
        scanner.close();
    }
}
