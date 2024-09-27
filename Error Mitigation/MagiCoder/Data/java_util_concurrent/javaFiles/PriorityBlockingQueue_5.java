import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_5 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();
        queue.add("Hello");
        queue.add("World");
        try {
            System.out.println(queue.take()); // Output: Hello
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
