import java.util.ArrayDeque;

public class ArrayDeque_4 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.add("Second");
        System.out.println("Deque before: " + deque);

        deque.removeLast();

        System.out.println("Deque after removeLast(): " + deque);
    }
}
