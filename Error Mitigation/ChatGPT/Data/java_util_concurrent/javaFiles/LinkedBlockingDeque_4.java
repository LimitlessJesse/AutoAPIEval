import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_4 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("First");
        deque.add("Second");
        
        System.out.println("Deque before poll: " + deque);
        
        String element = deque.poll();
        
        System.out.println("Element polled: " + element);
        System.out.println("Deque after poll: " + deque);
    }
}
