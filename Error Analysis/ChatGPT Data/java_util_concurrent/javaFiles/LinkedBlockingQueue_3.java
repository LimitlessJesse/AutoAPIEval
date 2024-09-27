import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_3 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Element at the front of the queue: " + queue.peek());
    }
}
