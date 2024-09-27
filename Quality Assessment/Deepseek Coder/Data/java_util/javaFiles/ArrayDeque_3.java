import java.util.ArrayDeque;

public class ArrayDeque_3 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Element1");
        deque.add("Element2");
        deque.add("Element3");

        System.out.println("Original Deque: " + deque);

        // Removing the first element
        String removedElement = deque.remove();

        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated Deque: " + deque);
    }
}
