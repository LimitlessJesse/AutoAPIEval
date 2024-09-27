import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class ReentrantReadWriteLock_ReadLock_5 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReadLock readLock = lock.readLock();
        
        // Usage of newCondition() method
        java.util.concurrent.locks.Condition condition = readLock.newCondition();
    }
}
