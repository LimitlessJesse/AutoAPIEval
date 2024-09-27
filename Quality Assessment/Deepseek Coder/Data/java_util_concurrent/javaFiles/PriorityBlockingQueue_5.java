import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_5 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Display the queue
        System.out.println("Original Queue: " + queue);

        // Remove an element from the queue
        boolean isRemoved = queue.remove(20);

        // Display the result of the remove operation
        System.out.println("Is 20 removed? " + isRemoved);

        // Display the queue after the remove operation
        System.out.println("Queue after remove: " + queue);
    }
}
