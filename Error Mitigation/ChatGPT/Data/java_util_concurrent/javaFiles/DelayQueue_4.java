import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class DelayQueue_4 {
    public static void main(String[] args) {
        DelayQueue<String> delayQueue = new DelayQueue<>();
        try {
            delayQueue.put("Element");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
