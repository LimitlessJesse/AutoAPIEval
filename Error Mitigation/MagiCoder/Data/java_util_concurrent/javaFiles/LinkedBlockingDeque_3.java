import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_3 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        System.out.println("Before removing: " + deque);

        String removedElement = deque.removeFirst();

        System.out.println("Removed element: " + removedElement);
        System.out.println("After removing: " + deque);
    }
}
