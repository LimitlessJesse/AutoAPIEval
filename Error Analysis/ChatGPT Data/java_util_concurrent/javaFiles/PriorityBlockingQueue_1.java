import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_1 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        // Inserting elements into the priority queue
        System.out.println("Offered: " + queue.offer(10)); // Should print true

        // Printing the priority queue
        System.out.println(queue);
    }
}
