import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_4 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        boolean hasWaitingConsumer = queue.hasWaitingConsumer();
        System.out.println("Has waiting consumer: " + hasWaitingConsumer);
    }
}
