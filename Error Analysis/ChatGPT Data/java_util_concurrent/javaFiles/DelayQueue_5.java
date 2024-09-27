import java.util.concurrent.DelayQueue;

public class DelayQueue_5 {
    public static void main(String[] args) {
        DelayQueue<String> queue = new DelayQueue<>();
        queue.put("Item 1");
        queue.put("Item 2");
        queue.put("Item 3");
        
        int queueSize = queue.size();
        System.out.println("DelayQueue size: " + queueSize);
    }
}
