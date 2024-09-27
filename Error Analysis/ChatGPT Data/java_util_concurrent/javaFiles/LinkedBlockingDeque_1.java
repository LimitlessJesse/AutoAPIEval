import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_1 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.putLast("World");
        System.out.println(deque);
    }
}
