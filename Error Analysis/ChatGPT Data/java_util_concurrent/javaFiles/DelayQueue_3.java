import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_3 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        queue.add(new DelayedElement("Element 1", 1000));
        
        DelayedElement peekedElement = queue.peek();
        System.out.println("Peeked element: " + peekedElement);
    }
}

class DelayedElement implements Delayed {
    private String element;
    private long delayTime;

    public DelayedElement(String element, long delayTime) {
        this.element = element;
        this.delayTime = System.currentTimeMillis() + delayTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.delayTime, ((DelayedElement) o).delayTime);
    }

    @Override
    public String toString() {
        return element;
    }
}
