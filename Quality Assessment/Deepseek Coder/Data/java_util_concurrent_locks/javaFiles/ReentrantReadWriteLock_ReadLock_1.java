import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_1 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
        
        // Lock the read lock
        readLock.lock();
        
        try {
            // Perform read operation here
            System.out.println("Reading operation...");
        } finally {
            // Always unlock the read lock in finally block
            readLock.unlock();
        }
    }
}
