import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_10 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        boolean result = deque.offerLast("Hello");
        System.out.println(result);  // Output: true
        System.out.println(deque);  // Output: [Hello]
    }
}
