import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_2 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        
        // Acquire the lock
        lock.lock();
        
        // Perform some operations
        
        // Release the lock
        lock.unlock();
    }
}
