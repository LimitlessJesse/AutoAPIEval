import java.util.PriorityQueue;

public class PriorityQueue_2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(3);
        pq.add(8);
        
        System.out.println("Head of the queue: " + pq.peek());
    }
}
