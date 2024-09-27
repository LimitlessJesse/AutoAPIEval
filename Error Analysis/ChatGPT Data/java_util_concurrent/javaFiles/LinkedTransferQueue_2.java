import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;

public class LinkedTransferQueue_2 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> transferQueue = new LinkedTransferQueue<>();
        boolean result = transferQueue.tryTransfer("Hello", 5, TimeUnit.SECONDS);
        System.out.println("Transfer successful: " + result);
    }
}
