import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_4 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();

        // Acquire the read lock
        readLock.lock();

        try {
            // Perform read operation
            System.out.println("Reading...");
        } finally {
            // Release the read lock
            readLock.unlock();
        }
    }
}
