import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class ReentrantReadWriteLock_WriteLock_8 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        WriteLock writeLock = lock.writeLock();

        // Generate a new condition
        java.util.concurrent.locks.Condition condition = writeLock.newCondition();

        // Usage of condition
        try {
            // Waiting for condition
            condition.await();

            // Signal all waiting threads
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
