import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_4 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        System.out.println("Deque before removal: " + deque);

        boolean removed = deque.remove("Second");

        System.out.println("Element 'Second' removed: " + removed);
        System.out.println("Deque after removal: " + deque);
    }
}
