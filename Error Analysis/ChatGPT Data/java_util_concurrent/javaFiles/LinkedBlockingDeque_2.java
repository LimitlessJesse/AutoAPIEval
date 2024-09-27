import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_2 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");
        
        String element = deque.takeFirst();
        System.out.println("First element taken: " + element);
        System.out.println("Remaining elements: " + deque);
    }
}
