import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AbstractQueuedSynchronizer_1 {
    public static void main(String[] args) {
        AbstractQueuedSynchronizer aqs = new AbstractQueuedSynchronizer() {
            @Override
            protected int tryAcquireShared(int arg) {
                return 0;
            }

            @Override
            protected boolean tryReleaseShared(int arg) {
                return true;
            }
        };

        int state = aqs.getState();
        System.out.println("Current state value: " + state);
    }
}
