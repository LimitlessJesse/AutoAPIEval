import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_2 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Adding elements to the queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Using poll() method to retrieve and remove the head of the queue
        String element = queue.poll();
        System.out.println("Removed element: " + element);
        System.out.println("Remaining elements in the queue: " + queue);
    }
}
