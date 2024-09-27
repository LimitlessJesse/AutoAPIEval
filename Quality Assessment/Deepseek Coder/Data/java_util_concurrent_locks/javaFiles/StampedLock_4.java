import java.util.concurrent.locks.StampedLock;

public class StampedLock_4 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        long stamp = lock.writeLock();
        try {
            boolean isValid = lock.validate(stamp);
            System.out.println("Stamp is valid: " + isValid);
        } finally {
            lock.unlock(stamp);
        }
    }
}
