import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_2 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add("Hello");
        try {
            String element = queue.take();
            System.out.println(element);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
