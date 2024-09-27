import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_2 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();

        // Try to acquire the read lock
        boolean isLockAcquired = readLock.tryLock();

        if (isLockAcquired) {
            System.out.println("Read lock acquired");
            // Perform read operation
        } else {
            System.out.println("Read lock not acquired");
        }

        // Release the lock
        readLock.unlock();
    }
}
