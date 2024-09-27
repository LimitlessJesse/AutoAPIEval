import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_4 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
