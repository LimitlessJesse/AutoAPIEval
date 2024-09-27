import java.util.PriorityQueue;

public class PriorityQueue_4 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue.contains("Hello"));  // Outputs: true
        System.out.println(queue.contains("Java"));  // Outputs: false
    }
}
