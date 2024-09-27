import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_1 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.put("Hello");
        System.out.println("Element added successfully");
    }
}
