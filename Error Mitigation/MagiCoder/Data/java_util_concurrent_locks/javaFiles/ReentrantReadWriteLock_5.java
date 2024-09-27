import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_5 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        boolean isWriteLocked = lock.isWriteLocked();
        System.out.println("Is write lock held? " + isWriteLocked);
    }
}
