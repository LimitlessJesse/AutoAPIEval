import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_3 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();

        // Add elements to the queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Print the queue
        System.out.println("Queue: " + queue);

        // Remove and return the head of the queue
        String head = queue.poll();

        // Print the head of the queue
        System.out.println("Head of the queue: " + head);

        // Print the queue after the poll operation
        System.out.println("Queue after poll operation: " + queue);
    }
}
