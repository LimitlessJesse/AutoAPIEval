import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_6 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        lock.writeLock().lock();
        try {
            System.out.println(lock.isWriteLockedByCurrentThread()); // Outputs: true
        } finally {
            lock.writeLock().unlock();
        }
    }
}
