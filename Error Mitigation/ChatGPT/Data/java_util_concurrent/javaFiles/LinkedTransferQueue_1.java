import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_1 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> transferQueue = new LinkedTransferQueue<>();
        
        // Transferring element to a waiting consumer immediately, if possible
        boolean transferred = transferQueue.tryTransfer("Hello");
        
        System.out.println("Element transferred: " + transferred);
    }
}
