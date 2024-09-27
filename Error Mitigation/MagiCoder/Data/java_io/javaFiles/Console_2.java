import java.io.Console;

public class Console_2 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console!= null) {
            char[] password = console.readPassword("Enter your password: ");
            if (password!= null) {
                System.out.println("Your password is: " + new String(password));
            } else {
                System.out.println("No password entered.");
            }
        } else {
            System.out.println("Console is not available.");
        }
    }
}
