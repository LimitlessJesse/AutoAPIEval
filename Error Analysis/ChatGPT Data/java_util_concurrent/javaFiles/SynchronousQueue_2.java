import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_2 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        System.out.println(queue.offer("One")); // Output: true
        System.out.println(queue.offer("Two")); // Output: false
    }
}
