import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_WriteLock_9 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
        
        boolean isLocked = writeLock.tryLock();
        System.out.println("Lock acquired: " + isLocked);
        
        // Release the lock
        writeLock.unlock();
    }
}
