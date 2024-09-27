import java.util.concurrent.DelayQueue;

public class DelayQueue_1 {
    public static void main(String[] args) {
        DelayQueue<String> delayQueue = new DelayQueue<>();
        boolean result = delayQueue.offer("Element");
        System.out.println("Element added successfully: " + result);
    }
}
