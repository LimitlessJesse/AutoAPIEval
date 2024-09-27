import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_5 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        String element = deque.peek();
        System.out.println(element);
    }
}
