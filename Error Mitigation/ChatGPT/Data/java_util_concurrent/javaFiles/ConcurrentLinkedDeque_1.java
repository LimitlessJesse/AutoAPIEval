import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_1 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        boolean result = deque.offer("Element");
        System.out.println("Element added successfully: " + result);
    }
}
