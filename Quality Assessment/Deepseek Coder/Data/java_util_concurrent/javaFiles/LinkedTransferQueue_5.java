import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_5 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.add("Hello");
        String element = queue.peek();
        System.out.println(element);
    }
}
