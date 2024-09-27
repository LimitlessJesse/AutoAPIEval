import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_20 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");
        deque.add("Hello");
        System.out.println(deque); // Output: [Hello, World, Hello]

        boolean removed = deque.removeLastOccurrence("Hello");
        System.out.println(removed); // Output: true
        System.out.println(deque); // Output: [Hello, World]
    }
}
