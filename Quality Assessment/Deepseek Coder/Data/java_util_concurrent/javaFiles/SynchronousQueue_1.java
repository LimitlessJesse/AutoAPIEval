import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_1 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        try {
            boolean offerSuccess = queue.offer("Hello");
            System.out.println("Offer successful: " + offerSuccess);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
