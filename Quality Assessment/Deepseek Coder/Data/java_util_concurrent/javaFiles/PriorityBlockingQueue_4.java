import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_4 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        boolean offerSuccess = queue.offer(10);
        System.out.println("Offer success: " + offerSuccess);
    }
}
