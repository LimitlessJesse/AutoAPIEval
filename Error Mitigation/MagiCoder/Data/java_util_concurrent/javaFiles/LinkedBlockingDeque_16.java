import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_16 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        // Retrieves, but does not remove, the last element of this deque
        String lastElement = deque.peekLast();
        System.out.println("Last element: " + lastElement);
    }
}
