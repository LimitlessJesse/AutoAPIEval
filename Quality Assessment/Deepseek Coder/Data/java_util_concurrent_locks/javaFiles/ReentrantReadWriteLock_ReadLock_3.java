import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_3 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
        
        // Try to acquire the lock
        boolean isLockAcquired = readLock.tryLock();
        System.out.println("Lock acquired? " + isLockAcquired);
        
        // Try to acquire the lock with a timeout
        try {
            isLockAcquired = readLock.tryLock(10, TimeUnit.SECONDS);
            System.out.println("Lock acquired with timeout? " + isLockAcquired);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
