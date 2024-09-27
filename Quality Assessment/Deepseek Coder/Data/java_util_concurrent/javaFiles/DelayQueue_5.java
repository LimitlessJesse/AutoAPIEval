import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_5 {
    public static void main(String[] args) {
        DelayQueue<DelayedObject> delayQueue = new DelayQueue<>();

        DelayedObject delayedObject = new DelayedObject("Hello", 5);
        delayQueue.put(delayedObject);

        System.out.println("DelayQueue: " + delayQueue);

        boolean isRemoved = delayQueue.remove(delayedObject);
        System.out.println("Is object removed? " + isRemoved);
        System.out.println("DelayQueue after removal: " + delayQueue);
    }
}

class DelayedObject implements Delayed {
    private String message;
    private long delayTime;

    public DelayedObject(String message, long delayTime) {
        this.message = message;
        this.delayTime = System.currentTimeMillis() + delayTime;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delayTime - System.currentTimeMillis();
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

    @Override
    public String toString() {
        return message;
    }
}
