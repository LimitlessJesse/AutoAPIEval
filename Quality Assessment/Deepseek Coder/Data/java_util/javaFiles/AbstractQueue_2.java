import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;

public class AbstractQueue_2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element1");
        queue.add("Element2");
        queue.add("Element3");
        System.out.println("Original Queue: " + queue);

        String removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated Queue: " + queue);
    }
}
