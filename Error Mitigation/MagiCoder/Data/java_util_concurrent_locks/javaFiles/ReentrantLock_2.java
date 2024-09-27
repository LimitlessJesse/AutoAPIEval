import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_2 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        Thread thread = new Thread(() -> {
            try {
                lock.lockInterruptibly();
                System.out.println("Lock acquired by " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("InterruptedException occurred in " + Thread.currentThread().getName());
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        });

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
