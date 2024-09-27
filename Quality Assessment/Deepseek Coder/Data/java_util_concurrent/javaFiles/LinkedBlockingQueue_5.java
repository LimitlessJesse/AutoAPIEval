import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_5 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        System.out.println("Size of the queue: " + queue.size());
    }
}
