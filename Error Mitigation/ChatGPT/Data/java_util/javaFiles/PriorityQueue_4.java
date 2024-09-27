import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_4 {
    public static void main(String[] args) {
        // Create a priority queue with a custom comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        // Add elements to the priority queue
        pq.add(3);
        pq.add(1);
        pq.add(2);
        
        // Print the elements in the priority queue
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
