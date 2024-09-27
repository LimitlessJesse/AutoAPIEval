import java.util.PriorityQueue;

public class PriorityQueue_1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(3);
        pq.offer(8);
        
        System.out.println("Priority Queue: " + pq);
    }
}
