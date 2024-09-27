import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_4 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();
        queue.offer("Hello");
        System.out.println(queue);
    }
}
