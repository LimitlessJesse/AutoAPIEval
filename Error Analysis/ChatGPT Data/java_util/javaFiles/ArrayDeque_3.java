import java.util.ArrayDeque;

public class ArrayDeque_3 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        System.out.println("Before removeFirst(): " + deque);

        String removed = deque.removeFirst();

        System.out.println("Removed element: " + removed);
        System.out.println("After removeFirst(): " + deque);
    }
}
