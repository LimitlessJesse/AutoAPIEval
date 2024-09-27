import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_5 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.offer("Element 1");
        queue.offer("Element 2");
        
        int waitingConsumerCount = queue.getWaitingConsumerCount();
        System.out.println("Number of waiting consumers: " + waitingConsumerCount);
    }
}
