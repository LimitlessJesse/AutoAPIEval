import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_2 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        boolean success = deque.offer("Hello");
        System.out.println("Addition successful: " + success);
        System.out.println("Deque: " + deque);
    }
}
