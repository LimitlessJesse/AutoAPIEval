import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_3 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("First");
        queue.add("Second");
        
        System.out.println("Head of the queue: " + queue.peek());
    }
}
