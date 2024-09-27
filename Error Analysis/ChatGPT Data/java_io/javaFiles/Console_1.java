import java.io.Console;

public class Console_1 {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("Console is not available");
            return;
        }
        
        String userInput = console.readLine("Enter your input: ");
        System.out.println("You entered: " + userInput);
    }
}
