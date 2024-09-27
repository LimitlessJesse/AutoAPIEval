import java.util.ArrayDeque;

public class ArrayDeque_1 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        boolean result = deque.add("Hello");
        System.out.println(result); // prints: true
        System.out.println(deque); // prints: [Hello]
    }
}
