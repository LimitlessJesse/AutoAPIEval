import java.util.ArrayDeque;

public class ArrayDeque_1 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addFirst("Second");
        
        System.out.println(deque);
    }
}
