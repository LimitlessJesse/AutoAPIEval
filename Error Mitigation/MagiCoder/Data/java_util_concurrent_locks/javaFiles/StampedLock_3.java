import java.util.concurrent.locks.StampedLock;

public class StampedLock_3 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        long stamp = lock.tryOptimisticRead();
        System.out.println("Stamp: " + stamp);
    }
}
