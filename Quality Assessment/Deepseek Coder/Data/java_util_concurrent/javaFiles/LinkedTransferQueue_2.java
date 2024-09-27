import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_2 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        boolean success = queue.offer("Hello");
        System.out.println("Offer successful: " + success);
    }
}
