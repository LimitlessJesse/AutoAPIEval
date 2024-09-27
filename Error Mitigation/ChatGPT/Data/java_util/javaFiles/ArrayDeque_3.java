import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class ArrayDeque_3 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.add("Second");
        
        try {
            String firstElement = deque.getFirst();
            System.out.println("First element: " + firstElement);
        } catch (NoSuchElementException e) {
            System.out.println("Deque is empty");
        }
    }
}
