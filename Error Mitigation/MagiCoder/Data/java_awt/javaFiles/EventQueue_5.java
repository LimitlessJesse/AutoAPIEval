import java.awt.EventQueue;

public class EventQueue_5 {
    public static void main(String[] args) {
        EventQueue.invokeAndWait(() -> {
            // Code to be executed in the event dispatch thread
            System.out.println("Hello, World!");
        });
    }
}
