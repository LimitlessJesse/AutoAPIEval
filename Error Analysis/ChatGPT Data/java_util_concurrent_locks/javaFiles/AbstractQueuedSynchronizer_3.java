import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AbstractQueuedSynchronizer_3 {
    public static void main(String[] args) {
        CustomSync sync = new CustomSync();
        int state = sync.getState();
        System.out.println("Current state: " + state);
    }

    static class CustomSync extends AbstractQueuedSynchronizer {
        @Override
        protected int getState() {
            return super.getState();
        }
    }
}
