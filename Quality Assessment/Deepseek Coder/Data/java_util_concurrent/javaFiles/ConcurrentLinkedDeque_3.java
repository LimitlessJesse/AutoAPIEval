import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_3 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Hello");
        String element = deque.poll();
        System.out.println(element);
    }
}
