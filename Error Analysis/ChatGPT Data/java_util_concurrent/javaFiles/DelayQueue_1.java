import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class DelayQueue_1 {
    public static void main(String[] args) {
        DelayQueue<Delayed> delayQueue = new DelayQueue<>();
        Delayed element = new DelayedElement(1000);
        boolean offerResult = delayQueue.offer(element);
        System.out.println("Element added successfully: " + offerResult);
    }
}

class DelayedElement implements Delayed {
    private long delayTime;

    public DelayedElement(long delay) {
        this.delayTime = System.currentTimeMillis() + delay;
    }

    @Override
    public long getDelay() {
        return delayTime - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.delayTime, ((DelayedElement) o).delayTime);
    }
}
