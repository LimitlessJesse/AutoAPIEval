import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_5 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        
        // Check if the lock is held by the current thread
        boolean isHeld = lock.isHeldByCurrentThread();
        System.out.println("Is lock held by current thread? " + isHeld);
    }
}
