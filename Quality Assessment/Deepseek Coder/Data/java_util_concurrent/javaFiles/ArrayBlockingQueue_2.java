import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        boolean success = queue.offer("Hello");
        if (success) {
            System.out.println("Element added successfully");
        } else {
            System.out.println("Queue is full");
        }
    }
}
