import java.util.PriorityQueue;

public class PriorityQueue_1 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        boolean added = queue.add("Hello");
        System.out.println("Element added: " + added);
        System.out.println("Queue: " + queue);
    }
}
