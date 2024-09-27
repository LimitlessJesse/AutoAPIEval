import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_4 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(1);
        System.out.println(queue.isEmpty()); // Output: false
        
        queue.poll(); // Remove element
        System.out.println(queue.isEmpty()); // Output: true
    }
}
