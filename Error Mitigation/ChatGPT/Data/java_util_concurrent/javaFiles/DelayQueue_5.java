import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class DelayQueue_5 {
    public static void main(String[] args) {
        DelayQueue<String> delayQueue = new DelayQueue<>();
        
        // Adding elements with delay
        delayQueue.put("Element 1");
        delayQueue.put("Element 2");
        
        try {
            // Retrieving and removing the head of the queue
            String element = delayQueue.take();
            System.out.println("Element taken: " + element);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
