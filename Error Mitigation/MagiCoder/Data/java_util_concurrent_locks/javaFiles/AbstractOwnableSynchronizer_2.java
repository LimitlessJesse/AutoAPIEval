import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class AbstractOwnableSynchronizer_2 {
    public static void main(String[] args) {
        AbstractOwnableSynchronizer synchronizer = new AbstractOwnableSynchronizer();
        Thread thread = Thread.currentThread();
        synchronizer.setExclusiveOwnerThread(thread);
    }
}
