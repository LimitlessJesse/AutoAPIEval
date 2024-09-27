import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_1 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        
        lock.lock();
        
        // Critical section of code
        
        lock.unlock();
    }
}
