import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_11 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("First");
        deque.add("Second");
        System.out.println(deque.pollFirst());  // Output: First
        System.out.println(deque.pollFirst());  // Output: Second
        System.out.println(deque.pollFirst());  // Output: null (deque is empty)
    }
}
