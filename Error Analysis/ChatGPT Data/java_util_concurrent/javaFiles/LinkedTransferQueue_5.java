import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_5 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.add("Element 1");
        queue.add("Element 2");
        System.out.println("Waiting consumer count: " + queue.getWaitingConsumerCount());
    }
}
