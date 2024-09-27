import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_3 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        queue.add(new DelayedElement(1000, "First element"));
        queue.add(new DelayedElement(5000, "Second element"));
        queue.add(new DelayedElement(2000, "Third element"));

        while (!queue.isEmpty()) {
            DelayedElement element = queue.poll();
            if (element!= null) {
                System.out.println("Element: " + element.getData() + " is ready to be processed");
            }
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
