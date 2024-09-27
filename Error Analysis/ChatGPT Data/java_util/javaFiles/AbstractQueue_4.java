import java.util.AbstractQueue;
import java.util.LinkedList;

public class AbstractQueue_4 {
    public static void main(String[] args) {
        AbstractQueue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        
        System.out.println("Queue: " + queue);
        
        String element = queue.element();
        System.out.println("Element at the front of the queue: " + element);
    }
}
