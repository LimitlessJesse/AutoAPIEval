import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_WriteLock_10 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
        
        // Try to acquire the lock
        boolean isLocked = writeLock.tryLock();
        System.out.println("Lock acquired? " + isLocked);
        
        // Try to acquire the lock with a timeout
        try {
            isLocked = writeLock.tryLock(10, TimeUnit.SECONDS);
            System.out.println("Lock acquired with timeout? " + isLocked);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
