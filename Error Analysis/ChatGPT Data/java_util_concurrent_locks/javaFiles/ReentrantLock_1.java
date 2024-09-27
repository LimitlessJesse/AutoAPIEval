import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_1 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        
        lock.lock();
        try {
            // Critical section
            System.out.println("Lock acquired");
        } finally {
            lock.unlock();
            System.out.println("Lock released");
        }
    }
}
