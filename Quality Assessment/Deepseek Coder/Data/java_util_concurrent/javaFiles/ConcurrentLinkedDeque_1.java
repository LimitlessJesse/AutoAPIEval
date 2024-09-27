import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_1 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        boolean success = deque.add("Hello");
        System.out.println("Addition successful: " + success);
        System.out.println("Deque: " + deque);
    }
}
