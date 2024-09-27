import java.util.Iterator;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class DelayQueue_4 {
    public static void main(String[] args) {
        DelayQueue<Delayed> delayQueue = new DelayQueue<>();
        delayQueue.add(new DelayedObject("Task 1", 5000));
        delayQueue.add(new DelayedObject("Task 2", 3000));

        Iterator<Delayed> iterator = delayQueue.iterator();
        while(iterator.hasNext()){
            Delayed item = iterator.next();
            System.out.println(item);
        }
    }

    static class DelayedObject implements Delayed {
        private String name;
        private long delay;

        public DelayedObject(String name, long delay) {
            this.name = name;
            this.delay = System.currentTimeMillis() + delay;
        }

        @Override
        public long getDelay(java.util.concurrent.TimeUnit unit) {
            long diff = delay - System.currentTimeMillis();
            return unit.convert(diff, java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            long diff = this.delay - ((DelayedObject) o).delay;
            return Long.compare(diff, 0);
        }

        @Override
        public String toString() {
            return "DelayedObject{" +
                    "name='" + name + '\'' +
                    ", delay=" + delay +
                    '}';
        }
    }
}
