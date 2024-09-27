import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_2 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        
        // Adding elements to the queue
        queue.add(5);
        queue.add(3);
        queue.add(8);
        
        // Polling elements from the queue
        System.out.println(queue.poll()); // Output: 3
        System.out.println(queue.poll()); // Output: 5
        System.out.println(queue.poll()); // Output: 8
    }
}
