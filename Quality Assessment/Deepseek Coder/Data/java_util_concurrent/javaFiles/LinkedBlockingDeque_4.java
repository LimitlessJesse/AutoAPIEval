import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_4 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        String element = deque.poll();
        System.out.println(element);  // Output: Hello
    }
}
