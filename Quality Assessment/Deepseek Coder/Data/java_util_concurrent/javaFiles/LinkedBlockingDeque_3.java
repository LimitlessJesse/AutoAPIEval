import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_3 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");

        try {
            String element = deque.take();
            System.out.println(element);  // Output: Hello
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
