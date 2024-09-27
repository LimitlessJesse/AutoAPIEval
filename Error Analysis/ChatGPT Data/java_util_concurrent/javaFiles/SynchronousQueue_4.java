import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronousQueue_4 {
    public static void main(String[] args) {
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();

        try {
            boolean result = synchronousQueue.offer("Test", 5, TimeUnit.SECONDS);
            System.out.println("Offer result: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
