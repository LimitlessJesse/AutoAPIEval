import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_5 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
        pq.offer(3);
        pq.offer(1);
        pq.offer(2);

        System.out.println("Queue before clear: " + pq);

        pq.clear();

        System.out.println("Queue after clear: " + pq);
    }
}
