import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Semaphore_11 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new Thread(() -> {
            try {
                // Acquire permit
                semaphore.acquire();
                System.out.println("Thread 1: Acquired permit");
                Thread.sleep(2000);
                System.out.println("Thread 1: Releasing permit");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                // Try to acquire permit with timeout
                if (semaphore.tryAcquire(1, 1, TimeUnit.SECONDS)) {
                    System.out.println("Thread 2: Acquired permit");
                    Thread.sleep(2000);
                    System.out.println("Thread 2: Releasing permit");
                    semaphore.release();
                } else {
                    System.out.println("Thread 2: Could not acquire permit");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
