import java.util.PriorityQueue;

public class PriorityQueue_3 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Peek: " + queue.peek());
    }
}
