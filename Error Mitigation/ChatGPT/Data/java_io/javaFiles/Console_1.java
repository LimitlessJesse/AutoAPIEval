import java.io.Console;

public class Console_1 {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("No console available");
            return;
        }
        
        String input = console.readLine();
        System.out.println("You entered: " + input);
    }
}
