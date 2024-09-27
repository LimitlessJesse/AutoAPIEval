import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_1 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();

        boolean transferSuccess = queue.tryTransfer("Hello");

        System.out.println("Transfer successful: " + transferSuccess);
    }
}
