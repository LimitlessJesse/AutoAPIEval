import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_3 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.add(10);
        queue.add(20);
        
        Integer head = queue.peek();
        System.out.println("Head of the queue: " + head);
    }
}
