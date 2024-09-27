import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_4 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        System.out.println("Hold count of the lock: " + lock.getHoldCount());
    }
}
