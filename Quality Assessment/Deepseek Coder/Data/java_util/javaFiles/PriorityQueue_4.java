import java.util.PriorityQueue;

public class PriorityQueue_4 {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        queue.add(10);
        queue.add(20);
        queue.add(15);

        // Display the head element
        System.out.println("Head value using peek function: " + queue.peek());

        // Remove the head element
        System.out.println("Head value using poll function: " + queue.poll());

        // Display the head element again
        System.out.println("Head value using peek function: " + queue.peek());
    }
}
