import java.io.Console;

public class Console_3 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console!= null) {
            String line = console.readLine();
            System.out.println("You entered: " + line);
        } else {
            System.out.println("Console is not available");
        }
    }
}
