import java.util.concurrent.CountDownLatch;

public class CountDownLatch_5 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        new Thread(() -> {
            try {
                Thread.sleep(2000);
                latch.countDown();
                System.out.println("Count after countDown(): " + latch.getCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(3000);
                latch.countDown();
                System.out.println("Count after countDown(): " + latch.getCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        latch.await();
        System.out.println("Count after await(): " + latch.getCount());
    }
}
