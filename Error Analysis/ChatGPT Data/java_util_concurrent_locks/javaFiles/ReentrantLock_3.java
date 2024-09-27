import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_3 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        
        // Check if the lock is currently locked
        boolean isLocked = lock.isLocked();
        
        System.out.println("Is lock locked? " + isLocked);
    }
}
