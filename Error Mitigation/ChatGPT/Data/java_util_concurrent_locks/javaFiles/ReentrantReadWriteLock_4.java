import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_4 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        int readHoldCount = lock.getReadHoldCount();
        System.out.println("Read hold count: " + readHoldCount);
    }
}
