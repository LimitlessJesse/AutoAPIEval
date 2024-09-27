import java.util.AbstractQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueue_1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedBlockingQueue<>();
        queue.add("Hello");
        System.out.println(queue);
    }
}
