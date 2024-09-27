import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_4 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        // Adding elements to the queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Polling elements from the queue
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Polled element: " + queue.poll());
    }
}
