import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_4 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Hello");
        String element = deque.peek();
        System.out.println(element);
    }
}
