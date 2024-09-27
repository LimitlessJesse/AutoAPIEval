import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        boolean success = queue.add("Hello");
        System.out.println("Addition successful: " + success);
        System.out.println("Queue: " + queue);
    }
}
