import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_4 {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.put(5);
        queue.put(3);
        queue.put(8);
        
        System.out.println("Head of the queue: " + queue.take());
    }
}
