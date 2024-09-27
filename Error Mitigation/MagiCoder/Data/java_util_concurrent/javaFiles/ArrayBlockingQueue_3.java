import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_3 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        boolean result = queue.offer("Hello");
        System.out.println(result);  // Output: true
        System.out.println(queue);  // Output: [Hello]
    }
}
