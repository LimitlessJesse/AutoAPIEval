import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_1 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(() -> {
            try {
                // Try to get the lock
                if (lock.tryLock(10, TimeUnit.SECONDS)) {
                    try {
                        System.out.println("Thread 1: Lock acquired");
                        Thread.sleep(5000);
                    } finally {
                        // Always release the lock in a finally block
                        lock.unlock();
                        System.out.println("Thread 1: Lock released");
                    }
                } else {
                    System.out.println("Thread 1: Unable to acquire lock");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                // Try to get the lock
                if (lock.tryLock(10, TimeUnit.SECONDS)) {
                    try {
                        System.out.println("Thread 2: Lock acquired");
                        Thread.sleep(5000);
                    } finally {
                        // Always release the lock in a finally block
                        lock.unlock();
                        System.out.println("Thread 2: Lock released");
                    }
                } else {
                    System.out.println("Thread 2: Unable to acquire lock");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
