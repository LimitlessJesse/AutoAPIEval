import java.awt.EventQueue;

public class EventQueue_4 {
    public static void main(String[] args) {
        boolean isDispatchThread = EventQueue.isDispatchThread();
        System.out.println("Is the current thread the dispatch thread? " + isDispatchThread);
    }
}
