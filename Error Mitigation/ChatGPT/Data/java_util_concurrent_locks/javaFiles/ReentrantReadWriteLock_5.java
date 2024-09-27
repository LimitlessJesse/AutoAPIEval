import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_5 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        int writeHoldCount = lock.writeLock().getWriteHoldCount();
        System.out.println("Number of write holds: " + writeHoldCount);
    }
}
