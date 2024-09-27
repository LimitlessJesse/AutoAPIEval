import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AbstractQueuedSynchronizer_5 {
    public static void main(String[] args) {
        AbstractQueuedSynchronizer aqs = new AbstractQueuedSynchronizer() {
            @Override
            protected boolean isHeldExclusively() {
                return false;
            }
        };
        
        boolean hasQueuedThreads = aqs.hasQueuedThreads();
        System.out.println("Are there any queued threads? " + hasQueuedThreads);
    }
}
