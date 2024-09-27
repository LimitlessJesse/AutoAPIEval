import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;

public class AbstractQueuedLongSynchronizer_4 {
    public static void main(String[] args) {
        AbstractQueuedLongSynchronizer sync = new AbstractQueuedLongSynchronizer();
        boolean result = sync.hasQueuedThreads();
        System.out.println("Are there any queued threads: " + result);
    }
}
