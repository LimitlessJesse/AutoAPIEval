import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_4 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        
        // Acquiring the lock using tryLock()
        boolean locked = lock.tryLock();
        
        if(locked) {
            try {
                // Critical section
                System.out.println("Lock acquired successfully");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Lock not acquired");
        }
    }
}
