import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueue_4 {
    public static void main(String[] args) {
        LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();
        queue.add("Hello");
        queue.add("World");

        System.out.println(queue.poll());  // Output: Hello
        System.out.println(queue.poll());  // Output: World
        System.out.println(queue.poll());  // Output: null (queue is empty)
    }
}
