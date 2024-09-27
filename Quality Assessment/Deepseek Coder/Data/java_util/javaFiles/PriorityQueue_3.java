import java.util.PriorityQueue;

public class PriorityQueue_3 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        
        queue.add("Hello");
        queue.add("World");
        queue.add("Java");
        
        System.out.println("Queue: " + queue);
        
        String head = queue.peek();
        
        System.out.println("Head of the queue: " + head);
        
        System.out.println("Queue after peek operation: " + queue);
    }
}
