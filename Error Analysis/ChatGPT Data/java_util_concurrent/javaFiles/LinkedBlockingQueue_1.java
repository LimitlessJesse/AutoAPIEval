import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_1 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        boolean offerSuccess = queue.offer("Element");
        System.out.println("Offer operation successful: " + offerSuccess);
    }
}
