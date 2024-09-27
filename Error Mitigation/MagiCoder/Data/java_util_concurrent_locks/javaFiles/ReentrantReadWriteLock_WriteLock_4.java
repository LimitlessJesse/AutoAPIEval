import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_WriteLock_4 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

        try {
            writeLock.lock();
            // Perform write operations here
        } finally {
            writeLock.unlock();
        }
    }
}
