import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_1 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();
        delayQueue.add(new DelayedElement(1000, "Hello"));
        delayQueue.add(new DelayedElement(500, "World"));

        while (!delayQueue.isEmpty()) {
            try {
                System.out.println(delayQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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

    public long getDelay(TimeUnit unit) {
        long diff = delay - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    public int compareTo(Delayed other) {
        if (this.getDelay(TimeUnit.MILLISECONDS) < other.getDelay(TimeUnit.MILLISECONDS)) {
            return -1;
        }
        if (this.getDelay(TimeUnit.MILLISECONDS) > other.getDelay(TimeUnit.MILLISECONDS)) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return message;
    }
}
