import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_1 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.offer(5);
        queue.offer(3);
        queue.offer(8);
        
        System.out.println(queue);
    }
}
