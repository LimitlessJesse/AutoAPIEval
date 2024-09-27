import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_3 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();

        // Add an element to the delay queue
        delayQueue.put(new DelayedElement(1000, "First element"));

        // Poll an element from the delay queue
        DelayedElement element = delayQueue.poll();

        if (element!= null) {
            System.out.println("Polled element: " + element.getMessage());
        } else {
            System.out.println("No elements in the delay queue");
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
