import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_4 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        try {
            queue.put("Element 1");
            System.out.println("Element added to the queue");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted while waiting to add element");
        }
    }
}
