import java.io.Console;

public class Console_4 {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            return;
        }

        String name = console.readLine("Enter your name: ");
        console.printf("Hello, %s!\n", name);
    }
}
