import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_2 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.add("Hello");
        try {
            String element = queue.take();
            System.out.println(element);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
