import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_1 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();
        queue.add("Hello");
        System.out.println(queue);
    }
}
