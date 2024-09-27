import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_2 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("First");
        deque.add("Second");
        
        System.out.println("Deque before poll: " + deque);
        
        String element = deque.poll();
        
        System.out.println("Element polled: " + element);
        System.out.println("Deque after poll: " + deque);
    }
}
