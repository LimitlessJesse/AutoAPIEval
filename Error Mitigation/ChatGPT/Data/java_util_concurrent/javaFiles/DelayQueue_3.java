import java.util.concurrent.DelayQueue;

public class DelayQueue_3 {
    public static void main(String[] args) {
        DelayQueue<String> delayQueue = new DelayQueue<>();
        delayQueue.add("Element 1");
        delayQueue.add("Element 2");
        
        System.out.println("Peek: " + delayQueue.peek());
    }
}
