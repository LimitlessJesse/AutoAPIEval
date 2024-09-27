import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_4 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();

        DelayedElement element = new DelayedElement(1000, "Hello");
        delayQueue.put(element);

        DelayedElement peekedElement = delayQueue.peek();
        if (peekedElement!= null) {
            System.out.println(peekedElement.getMessage());
        } else {
            System.out.println("DelayQueue is empty");
        }
    }
}

class DelayedElement implements Delayed {
    private long delay;
    private String message;

    public DelayedElement(long delay, String message) {
        this.delay = System.currentTimeMillis() + delay;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delay - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS)) {
            return -1;
        } else if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) {
            return 1;
        }
        return 0;
    }
}
