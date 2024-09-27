import java.util.concurrent.CountDownLatch;

public class CountDownLatch_1 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);

        Runnable task = () -> {
            try {
                Thread.sleep(2000);
                System.out.println("Task completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                latch.countDown();
            }
        };

        new Thread(task).start();

        try {
            System.out.println("Waiting for task to complete...");
            latch.await();
            System.out.println("Task has been completed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
