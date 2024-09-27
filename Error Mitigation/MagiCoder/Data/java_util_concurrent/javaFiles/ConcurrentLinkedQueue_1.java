import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_1 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Hello");
        System.out.println(queue);
    }
}
