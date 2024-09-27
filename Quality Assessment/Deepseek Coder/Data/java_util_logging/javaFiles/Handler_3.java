import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;

public class Handler_3 {
    public static void main(String[] args) {
        Handler handler = new ConsoleHandler();
        try {
            handler.close();
            System.out.println("Handler closed successfully.");
        } catch (SecurityException e) {
            System.out.println("Failed to close handler: " + e.getMessage());
        }
    }
}
