import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_4 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        try {
            if (lock.tryLock(10, TimeUnit.SECONDS)) {
                // Perform actions here
                System.out.println("Lock acquired");
            } else {
                System.out.println("Unable to acquire lock");
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
