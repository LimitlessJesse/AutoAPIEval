import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_1 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.offerFirst("First");
        deque.offerFirst("Second");
        System.out.println(deque);
    }
}
