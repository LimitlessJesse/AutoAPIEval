import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_4 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        int readLockCount = lock.getReadLockCount();
        System.out.println("Number of readers holding the read lock: " + readLockCount);
    }
}
