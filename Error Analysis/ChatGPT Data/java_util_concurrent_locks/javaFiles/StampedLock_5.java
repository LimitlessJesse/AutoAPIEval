import java.util.concurrent.locks.StampedLock;

public class StampedLock_5 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        
        long stamp = lock.writeLock();
        try {
            // Perform write operations
        } finally {
            lock.unlockWrite(stamp);
        }
        
        long optimisticStamp = lock.tryConvertToOptimisticRead(stamp);
        if (optimisticStamp != 0) {
            // Perform optimistic read operations
            System.out.println("Optimistic read successful");
        } else {
            // Handle conversion failure
            System.out.println("Optimistic read conversion failed");
        }
    }
}
