import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_2 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Hello");
        deque.add("World");

        String element = deque.pollLast();
        System.out.println("Removed element: " + element);
        System.out.println("Deque after removal: " + deque);
    }
}
