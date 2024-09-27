import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_7 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");

        // Retrieves, but does not remove, the head of the queue
        String head = deque.peek();
        System.out.println(head);  // Output: Hello
    }
}
