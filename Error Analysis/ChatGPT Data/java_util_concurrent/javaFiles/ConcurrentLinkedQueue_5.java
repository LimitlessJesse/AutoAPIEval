import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_5 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        
        System.out.println("Size of the queue: " + queue.size());
    }
}
