import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;

public class AbstractQueuedLongSynchronizer_3 {
    public static void main(String[] args) {
        AbstractQueuedLongSynchronizer aqs = new AbstractQueuedLongSynchronizer();
        boolean hasQueuedPredecessors = aqs.hasQueuedPredecessors();
        System.out.println("Are there any queued predecessors?: " + hasQueuedPredecessors);
    }
}
