import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_2 {
    public static void main(String[] args) {
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();

        readLock.lock();
        try {
            // Critical section where shared data is read
            System.out.println("Reading shared data...");
        } finally {
            readLock.unlock();
        }
    }
}
