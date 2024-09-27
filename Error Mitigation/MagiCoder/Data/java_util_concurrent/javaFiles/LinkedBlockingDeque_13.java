import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_13 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("First");
        deque.add("Second");
        System.out.println(deque.getFirst());  // Output: First
    }
}
