import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_5 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        boolean writeLocked = lock.writeLock().isHeldByCurrentThread();
        System.out.println("Is write locked: " + writeLocked);
    }
}
