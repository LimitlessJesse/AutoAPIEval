import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_3 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        boolean isLocked;
        try {
            isLocked = lock.tryLock(10, TimeUnit.SECONDS);
            if (isLocked) {
                System.out.println("Lock acquired");
                // Perform some operations here
            } else {
                System.out.println("Unable to acquire lock within 10 seconds");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
