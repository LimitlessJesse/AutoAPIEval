import java.io.Console;

public class Console_2 {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("Console is not available");
            return;
        }
        
        char[] password = console.readPassword("Enter password: ");
        
        if (password != null) {
            System.out.println("Password entered: " + new String(password));
        } else {
            System.out.println("End of stream reached");
        }
    }
}
