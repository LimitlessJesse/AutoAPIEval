import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_2 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        
        // Adding elements to the queue
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");
        
        // Using poll() to retrieve and remove the head of the queue
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        
        // Displaying the remaining elements in the queue
        System.out.println("Queue elements: " + queue);
    }
}
