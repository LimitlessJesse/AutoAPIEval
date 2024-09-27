import java.util.ArrayDeque;

public class ArrayDeque_5 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        String firstElement = deque.getFirst();
        System.out.println("First element in the deque: " + firstElement);
    }
}
