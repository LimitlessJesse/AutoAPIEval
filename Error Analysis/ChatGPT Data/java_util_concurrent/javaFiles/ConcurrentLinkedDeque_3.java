import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_3 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("First");
        deque.add("Second");

        System.out.println("First element: " + deque.peekFirst());
    }
}
