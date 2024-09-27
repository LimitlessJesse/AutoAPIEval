import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_5 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        boolean result = queue.offer("Hello");
        System.out.println(result);  // Output: true
    }
}
