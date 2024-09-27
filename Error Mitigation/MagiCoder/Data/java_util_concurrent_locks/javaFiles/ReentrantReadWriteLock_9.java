import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_9 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        int readLockCount = lock.readLock().getReadLockCount();
        System.out.println("Number of read locks held: " + readLockCount);
    }
}
