import java.util.ArrayDeque;

public class ArrayDeque_4 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        System.out.println(deque.pollFirst()); // prints: Hello
        System.out.println(deque); // prints: [World]
    }
}
