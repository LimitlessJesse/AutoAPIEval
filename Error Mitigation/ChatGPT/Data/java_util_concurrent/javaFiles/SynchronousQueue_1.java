import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_1 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        
        try {
            queue.put("Hello");
            System.out.println("Element added to the queue");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
