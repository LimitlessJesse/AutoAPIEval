import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_WriteLock_7 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

        // Lock the writeLock
        writeLock.lock();

        try {
            // Perform write operation
            System.out.println("Performing write operation...");
        } finally {
            // Unlock the writeLock
            writeLock.unlock();
        }
    }
}
