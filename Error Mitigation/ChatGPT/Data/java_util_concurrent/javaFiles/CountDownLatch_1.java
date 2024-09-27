import java.util.concurrent.CountDownLatch;

public class CountDownLatch_1 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);

        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is waiting...");
                latch.await();
                System.out.println("Thread has been released");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();

        Thread.sleep(2000); // Simulating some operations

        latch.countDown(); // Releases the waiting thread
    }
}
