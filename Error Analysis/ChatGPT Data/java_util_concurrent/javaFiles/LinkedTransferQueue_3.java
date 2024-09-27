import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_3 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> transferQueue = new LinkedTransferQueue<>();
        
        // Transfers the specified element immediately if there is a consumer waiting
        // If no consumer is waiting, this method blocks until a consumer is ready to receive the element
        try {
            transferQueue.transfer("Hello");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        String element = transferQueue.poll(); // Retrieves and removes the head of the queue
        System.out.println("Transferred element: " + element);
    }
}
