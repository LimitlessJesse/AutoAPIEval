import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_1 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        try {
            String element = queue.take();
            System.out.println("Element taken from SynchronousQueue: " + element);
        } catch (InterruptedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
