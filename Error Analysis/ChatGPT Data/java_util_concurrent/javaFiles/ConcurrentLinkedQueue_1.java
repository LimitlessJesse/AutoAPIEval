import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_1 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Adding elements to the queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");

        System.out.println("Queue: " + queue);
    }
}
