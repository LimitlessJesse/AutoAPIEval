import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_2 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();
        
        delayQueue.offer(new DelayedElement("Element 1", 2000));
        delayQueue.offer(new DelayedElement("Element 2", 4000));
        
        while (!delayQueue.isEmpty()) {
            DelayedElement element = delayQueue.poll();
            System.out.println("Processing element: " + element.getName());
        }
    }
}

class DelayedElement implements Delayed {
    private String name;
    private long delayTime;

    public DelayedElement(String name, long delayTime) {
        this.name = name;
        this.delayTime = System.currentTimeMillis() + delayTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = this.delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long diff = this.delayTime - ((DelayedElement) o).delayTime;
        return Long.compare(diff, 0);
    }
}
