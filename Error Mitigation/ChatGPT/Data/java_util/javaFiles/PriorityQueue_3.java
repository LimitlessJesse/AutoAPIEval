import java.util.PriorityQueue;

public class PriorityQueue_3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(2);
        
        System.out.println("Priority Queue: " + pq);
        
        System.out.println("Polling from the queue: " + pq.poll());
        System.out.println("Priority Queue after polling: " + pq);
    }
}
