import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_1 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        boolean success = queue.add("Hello");
        System.out.println("Addition successful: " + success);
        System.out.println("Queue: " + queue);
    }
}
