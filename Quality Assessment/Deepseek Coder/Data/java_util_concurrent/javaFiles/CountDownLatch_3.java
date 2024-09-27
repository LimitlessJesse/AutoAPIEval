import java.util.concurrent.CountDownLatch;

public class CountDownLatch_3 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running");
            latch.countDown();
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
            latch.countDown();
        });

        Thread thread3 = new Thread(() -> {
            System.out.println("Thread 3 is running");
            latch.countDown();
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            latch.await();
            System.out.println("All threads have finished executing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
