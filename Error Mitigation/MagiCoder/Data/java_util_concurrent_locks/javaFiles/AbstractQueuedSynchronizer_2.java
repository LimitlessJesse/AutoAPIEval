import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AbstractQueuedSynchronizer_2 {
    public static void main(String[] args) {
        AQS aqs = new AQS();
        aqs.compareAndSetState(0, 1);
    }
}

class AQS extends AbstractQueuedSynchronizer {
    @Override
    protected boolean compareAndSetState(int expect, int update) {
        return super.compareAndSetState(expect, update);
    }
}
