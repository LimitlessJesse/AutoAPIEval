import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_9 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        boolean result = deque.offerFirst("Hello");
        System.out.println(result);
    }
}
