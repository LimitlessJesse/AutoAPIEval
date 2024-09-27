import java.util.concurrent.locks.StampedLock;

public class StampedLock_3 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();

        long stamp = lock.writeLock();
        try {
            // Critical section
            System.out.println("Write lock acquired");
        } finally {
            lock.unlockWrite(stamp);
        }
    }
}
