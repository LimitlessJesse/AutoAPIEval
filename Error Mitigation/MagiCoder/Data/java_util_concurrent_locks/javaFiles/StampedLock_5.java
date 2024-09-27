import java.util.concurrent.locks.StampedLock;

public class StampedLock_5 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        long stamp = lock.writeLock();
        try {
            // Perform write operations here
        } finally {
            lock.unlock(stamp);
        }
    }
}
