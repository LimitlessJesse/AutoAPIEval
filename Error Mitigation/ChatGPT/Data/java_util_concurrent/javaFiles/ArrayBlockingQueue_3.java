import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_3 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        queue.add("First");
        queue.add("Second");
        
        System.out.println("Head of the queue: " + queue.peek());
    }
}
