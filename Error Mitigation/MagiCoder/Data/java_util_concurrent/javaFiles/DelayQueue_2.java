import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_2 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        queue.put(new DelayedElement(1000, "First element"));
        queue.put(new DelayedElement(5000, "Second element"));
        queue.put(new DelayedElement(2000, "Third element"));

        try {
            while (true) {
                DelayedElement element = queue.take();
                System.out.println("Taken: " + element.getData());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DelayedElement implements Delayed {
    private long delay;
    private String data;

    public DelayedElement(long delay, String data) {
        this.delay = System.currentTimeMillis() + delay;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delay - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.delay < ((DelayedElement) o).delay) {
            return -1;
        }
        if (this.delay > ((DelayedElement) o).delay) {
            return 1;
        }
        return 0;
    }
}
