import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_3 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Element at the front of the queue: " + queue.peek());
    }
}
