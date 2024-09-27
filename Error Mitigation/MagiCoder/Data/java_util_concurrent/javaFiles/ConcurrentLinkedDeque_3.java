import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_3 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque.remove());  // Output: Hello
    }
}
