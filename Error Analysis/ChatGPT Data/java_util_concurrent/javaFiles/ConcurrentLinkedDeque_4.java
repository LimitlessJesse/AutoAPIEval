import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_4 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque);

        // Removing the last occurrence of "Hello"
        boolean removed = deque.removeLastOccurrence("Hello");
        System.out.println("Is 'Hello' removed? " + removed);
        System.out.println(deque);
    }
}
