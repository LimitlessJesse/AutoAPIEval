import java.util.ArrayDeque;

public class ArrayDeque_2 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        boolean result = deque.offer("Hello");
        System.out.println("Element added: " + result);
        System.out.println("Deque: " + deque);
    }
}
