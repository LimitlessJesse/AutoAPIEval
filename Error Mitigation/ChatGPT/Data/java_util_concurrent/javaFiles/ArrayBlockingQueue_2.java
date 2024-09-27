import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        queue.add("First");
        queue.add("Second");
        
        System.out.println("Queue: " + queue);
        
        String head = queue.poll();
        System.out.println("Head of the queue: " + head);
        
        System.out.println("Updated Queue: " + queue);
    }
}
