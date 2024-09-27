import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Semaphore_9 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new Thread(() -> {
            try {
                System.out.println("Thread 1: Acquiring lock...");
                semaphore.acquire();
                System.out.println("Thread 1: Lock acquired.");
                Thread.sleep(2000);
                semaphore.release();
                System.out.println("Thread 1: Lock released.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Thread 2: Trying to acquire lock...");
                if (semaphore.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println("Thread 2: Lock acquired.");
                    Thread.sleep(2000);
                    semaphore.release();
                    System.out.println("Thread 2: Lock released.");
                } else {
                    System.out.println("Thread 2: Could not acquire lock.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
