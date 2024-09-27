import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_3 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        boolean result = queue.offer("Hello");
        System.out.println("Element added to queue: " + result);
    }
}
