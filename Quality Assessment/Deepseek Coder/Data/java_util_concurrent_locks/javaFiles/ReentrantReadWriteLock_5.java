import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_5 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        System.out.println("Initial read lock count: " + lock.getReadLockCount());

        // Acquire read lock
        lock.readLock().lock();
        System.out.println("Read lock count after acquiring read lock: " + lock.getReadLockCount());

        // Release read lock
        lock.readLock().unlock();
        System.out.println("Read lock count after releasing read lock: " + lock.getReadLockCount());
    }
}
