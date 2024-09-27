import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_3 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        boolean success = queue.offer("Hello");
        if (success) {
            System.out.println("Element added successfully");
        } else {
            System.out.println("Failed to add element");
        }
    }
}
