import java.io.Console;

public class Console_5 {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("No console available");
            return;
        }
        
        console.flush();
        System.out.println("Console flushed successfully");
    }
}
