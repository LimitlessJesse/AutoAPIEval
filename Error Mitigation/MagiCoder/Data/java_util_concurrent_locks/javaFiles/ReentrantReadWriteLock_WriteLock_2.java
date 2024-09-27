import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_WriteLock_2 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

        // Try to acquire the write lock
        boolean isLockAcquired = writeLock.tryLock();

        if (isLockAcquired) {
            // Perform write operations here
            System.out.println("Write lock acquired");

            // Release the write lock
            writeLock.unlock();
        } else {
            System.out.println("Write lock not acquired");
        }
    }
}
