import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_2 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
        
        boolean isLocked = readLock.tryLock();
        System.out.println("Is the lock acquired? " + isLocked);
        
        // Don't forget to unlock the lock
        readLock.unlock();
    }
}
