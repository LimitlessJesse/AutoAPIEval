import java.util.concurrent.DelayQueue;

public class DelayQueue_2 {
    public static void main(String[] args) {
        DelayQueue<String> delayQueue = new DelayQueue<>();
        delayQueue.offer("Element 1");
        delayQueue.offer("Element 2");
        
        System.out.println("Polling from DelayQueue:");
        System.out.println(delayQueue.poll());
        System.out.println(delayQueue.poll());
        System.out.println(delayQueue.poll());
    }
}
