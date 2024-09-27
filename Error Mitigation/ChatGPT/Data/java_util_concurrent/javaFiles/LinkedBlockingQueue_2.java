import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_2 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.offer("First");
        queue.offer("Second");
        
        System.out.println("Queue: " + queue);
        
        String head = queue.poll();
        System.out.println("Head of the queue: " + head);
        
        System.out.println("Updated Queue: " + queue);
    }
}
