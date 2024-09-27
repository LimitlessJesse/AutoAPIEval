import java.io.Console;
import java.util.Scanner;

public class Console_4 {
    public static void main(String[] args) {
        Console con = System.console();
        
        if (con != null) {
            Scanner sc = new Scanner(con.reader());
            System.out.println("Enter a line of text:");
            String line = sc.nextLine();
            System.out.println("You entered: " + line);
        } else {
            System.out.println("No console available");
        }
    }
}
