import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingDeque;

public class LinkedBlockingDeque_8 {
    public static void main(String[] args) {
        BlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        String element = deque.element();
        System.out.println(element);
    }
}
