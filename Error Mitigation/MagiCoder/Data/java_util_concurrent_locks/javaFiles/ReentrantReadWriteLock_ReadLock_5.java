import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_5 {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock readLock = lock.readLock();

    public static void main(String[] args) {
        ReentrantReadWriteLock_ReadLock_5 main = new ReentrantReadWriteLock_ReadLock_5();
        main.readLock.lock();
        try {
            // do something
        } finally {
            main.readLock.unlock();
        }
    }
}
