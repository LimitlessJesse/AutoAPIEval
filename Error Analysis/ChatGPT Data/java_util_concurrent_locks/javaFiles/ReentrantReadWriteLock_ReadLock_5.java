import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_5 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();

        boolean locked = false;
        try {
            locked = readLock.tryLock(5, TimeUnit.SECONDS);
            
            if (locked) {
                System.out.println("Read lock acquired");
            } else {
                System.out.println("Failed to acquire read lock within 5 seconds");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (locked) {
                readLock.unlock();
            }
        }
    }
}
