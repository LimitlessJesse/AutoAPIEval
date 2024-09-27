import java.io.Console;
import java.io.PrintWriter;

public class Console_3 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            PrintWriter writer = console.writer();
            writer.println("Hello, world!");
        } else {
            System.out.println("Console is not available");
        }
    }
}
