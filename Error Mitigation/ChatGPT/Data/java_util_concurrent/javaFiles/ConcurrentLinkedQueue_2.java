import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_2 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("First");
        queue.add("Second");
        
        System.out.println("Queue: " + queue);
        
        String head = queue.poll();
        System.out.println("Head of the queue: " + head);
        
        System.out.println("Updated Queue: " + queue);
    }
}
