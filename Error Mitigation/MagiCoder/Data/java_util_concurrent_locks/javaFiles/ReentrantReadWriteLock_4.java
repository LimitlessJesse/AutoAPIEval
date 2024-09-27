import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_4 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        boolean isFair = lock.isFair();
        System.out.println("Is the lock fair? " + isFair);
    }
}
