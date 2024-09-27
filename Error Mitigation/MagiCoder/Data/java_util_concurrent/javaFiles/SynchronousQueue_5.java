import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_5 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        System.out.println(queue.size()); // Output: 0
    }
}
