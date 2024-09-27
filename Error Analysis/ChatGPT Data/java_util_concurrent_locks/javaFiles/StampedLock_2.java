import java.util.concurrent.locks.StampedLock;

public class StampedLock_2 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        
        long stamp = lock.tryReadLock();
        try {
            // code that requires read lock
        } finally {
            lock.unlockRead(stamp);
        }
    }
}
