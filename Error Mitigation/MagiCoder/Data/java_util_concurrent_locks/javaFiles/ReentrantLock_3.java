import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_3 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        // Try to acquire the lock
        boolean isLocked = lock.tryLock();

        if (isLocked) {
            try {
                // Perform operations here
                System.out.println("Lock acquired and operations performed");
            } finally {
                // Always release the lock
                lock.unlock();
            }
        } else {
            System.out.println("Lock is not available");
        }
    }
}
