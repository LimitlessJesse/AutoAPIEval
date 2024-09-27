import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_1 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            // Perform actions here
        } finally {
            lock.unlock();
        }
    }
}
