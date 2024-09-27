import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_2 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();

        DelayedElement element1 = new DelayedElement("Element 1", 5);
        DelayedElement element2 = new DelayedElement("Element 2", 10);

        delayQueue.put(element1);
        delayQueue.put(element2);

        DelayedElement takenElement = delayQueue.take();
        System.out.println("Taken element: " + takenElement.getElement());
    }
}

class DelayedElement implements Delayed {
    private String element;
    private long delay;

    public DelayedElement(String element, long delay) {
        this.element = element;
        this.delay = System.currentTimeMillis() + delay * 1000;
    }

    public String getElement() {
        return element;
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
