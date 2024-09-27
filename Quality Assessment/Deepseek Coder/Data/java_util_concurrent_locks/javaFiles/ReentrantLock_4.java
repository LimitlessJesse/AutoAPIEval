import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_4 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            // critical section (protected by lock)
        } finally {
            lock.unlock();
        }
    }
}
