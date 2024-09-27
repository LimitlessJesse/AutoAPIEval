import java.io.Console;

public class Console_4 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console!= null) {
            console.flush();
        }
    }
}
