import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_3 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();

        try {
            if (readLock.tryLock(10, TimeUnit.SECONDS)) {
                System.out.println("Read lock acquired");
                // Perform read operation
            } else {
                System.out.println("Read lock not acquired");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
    }
}
