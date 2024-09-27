import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_1 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        boolean success = deque.add("Hello");
        System.out.println("Addition successful: " + success);
        System.out.println("Deque: " + deque);
    }
}
