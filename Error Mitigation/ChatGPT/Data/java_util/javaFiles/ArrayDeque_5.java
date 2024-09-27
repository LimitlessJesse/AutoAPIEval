import java.util.ArrayDeque;

public class ArrayDeque_5 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.add("Second");
        
        System.out.println("Deque before removeFirst: " + deque);
        
        String removedElement = deque.removeFirst();
        
        System.out.println("Removed element: " + removedElement);
        System.out.println("Deque after removeFirst: " + deque);
    }
}
