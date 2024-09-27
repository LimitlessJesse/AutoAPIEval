import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_5 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        try {
            queue.put("Element");
            System.out.println(queue.peek());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
