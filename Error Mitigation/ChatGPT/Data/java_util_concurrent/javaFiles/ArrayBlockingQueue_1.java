import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        
        // Insert element into the queue
        boolean result = queue.offer(10);
        
        System.out.println("Element added successfully: " + result);
    }
}
