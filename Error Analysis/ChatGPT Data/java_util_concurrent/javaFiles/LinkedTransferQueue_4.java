import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_4 {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        System.out.println("Queue has waiting consumer: " + queue.hasWaitingConsumer());
    }
}
