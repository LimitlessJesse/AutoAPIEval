import java.util.concurrent.locks.StampedLock;

public class StampedLock_1 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        long stamp = lock.writeLock();
        try {
            // Write operations here
        } finally {
            lock.unlockWrite(stamp);
        }
    }
}
