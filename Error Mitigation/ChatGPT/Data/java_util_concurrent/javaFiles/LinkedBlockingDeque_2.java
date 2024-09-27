import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_2 {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.put("First");
        deque.put("Second");
        
        String element = deque.take();
        System.out.println("Element taken: " + element);
    }
}
