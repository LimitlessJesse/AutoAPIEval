import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_1 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Hello");
        System.out.println(deque);
    }
}
