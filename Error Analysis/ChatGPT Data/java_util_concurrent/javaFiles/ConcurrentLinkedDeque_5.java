import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_5 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        System.out.println("Is deque empty? " + deque.isEmpty()); // Output: Is deque empty? true
        deque.add("Hello");
        System.out.println("Is deque empty? " + deque.isEmpty()); // Output: Is deque empty? false
    }
}
