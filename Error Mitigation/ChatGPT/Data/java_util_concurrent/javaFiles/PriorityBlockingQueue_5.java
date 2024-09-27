import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_5 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.add(5);
        queue.add(3);
        queue.add(8);
        
        System.out.println("Size of the PriorityBlockingQueue: " + queue.size());
    }
}
