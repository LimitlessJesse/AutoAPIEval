import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_4 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque);
        String lastElement = deque.removeLast();
        System.out.println("Removed last element: " + lastElement);
        System.out.println(deque);
    }
}
