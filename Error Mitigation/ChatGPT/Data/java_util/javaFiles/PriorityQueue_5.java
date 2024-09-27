import java.util.PriorityQueue;

public class PriorityQueue_5 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(10);
        pq.add(3);
        
        System.out.println("Size of PriorityQueue: " + pq.size());
    }
}
