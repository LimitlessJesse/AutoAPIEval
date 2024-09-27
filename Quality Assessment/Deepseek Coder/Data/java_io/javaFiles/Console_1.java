import java.io.Console;

public class Console_1 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console!= null) {
            char[] password = console.readPassword("Enter your password: ");
            // do something with password
        } else {
            System.out.println("Console is not available");
        }
    }
}
