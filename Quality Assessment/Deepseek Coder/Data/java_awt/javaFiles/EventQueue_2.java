import java.awt.EventQueue;

public class EventQueue_2 {
    public static void main(String[] args) {
        EventQueue.invokeAndWait(new Runnable() {
            public void run() {
                System.out.println("Hello, World!");
            }
        });
    }
}
