import java.util.concurrent.locks.StampedLock;

public class StampedLock_9 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        long stamp = lock.writeLock();
        try {
            // Perform write operation
        } finally {
            lock.unlockWrite(stamp);
        }
    }
}
