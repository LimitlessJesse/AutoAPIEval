import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_4 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Adding elements to the queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Printing the queue
        System.out.println("Queue: " + queue);

        // Removing an element from the queue
        String removedElement = queue.poll();

        // Printing the removed element and the updated queue
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated queue: " + queue);
    }
}
