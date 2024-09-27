import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;

public class AbstractQueuedLongSynchronizer_1 {
    public static void main(String[] args) {
        AbstractQueuedLongSynchronizer synchronizer = new AbstractQueuedLongSynchronizer();
        synchronizer.setState(10);
        System.out.println("State set to: " + synchronizer.getState());
    }
}
