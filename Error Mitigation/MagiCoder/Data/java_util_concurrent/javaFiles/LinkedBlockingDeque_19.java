import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_19 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");
        deque.add("Hello");

        System.out.println("Before removal: " + deque);

        boolean removed = deque.removeFirstOccurrence("Hello");

        System.out.println("After removal: " + deque);
        System.out.println("Removed: " + removed);
    }
}
