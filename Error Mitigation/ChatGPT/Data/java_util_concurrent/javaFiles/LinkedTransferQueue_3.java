import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_3 {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.put("Hello");
        String element = queue.take();
        System.out.println(element);
    }
}
