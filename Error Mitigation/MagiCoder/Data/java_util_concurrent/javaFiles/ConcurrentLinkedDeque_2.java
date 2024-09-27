import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_2 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        boolean result = deque.offer("Hello");
        System.out.println(result);  // prints: true
        System.out.println(deque);  // prints: [Hello]
    }
}
