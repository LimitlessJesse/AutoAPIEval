import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_5 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Element 1");
        queue.add("Element 2");
        
        System.out.println("Size of the queue: " + queue.size());
    }
}
